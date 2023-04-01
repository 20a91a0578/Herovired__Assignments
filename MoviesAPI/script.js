const apiUrl = 'https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=3fd2be6f0c70a2a598f084ddfb75487c&page=1';
const searchUrl = 'https://api.themoviedb.org/3/search/movie?api_key=3fd2be6f0c70a2a598f084ddfb75487c&query=';
const moviess = document.getElementById('movies');
const textsearches = document.getElementById('textsearch');
const btnsearchs = document.getElementById('btnsearch');
Movies(apiUrl);
btnsearchs.addEventListener('click', function() {
  const keyword = textsearches.value;
  if (keyword !== '') {
    Movies(searchUrl + keyword);
  }
});
function Movies(url) {
  moviess.innerHTML = '';
  fetch(url)
    .then(response => response.json())
    .then(data => {
      const movies = data.results;
      movies.forEach(movie => {
        const movieElement = document.createElement('div');
        movieElement.className = 'movie';
        movieElement.dataset.movieId = movie.id;
        movieElement.innerHTML = `
          <img src="https://image.tmdb.org/t/p/w500/${movie.poster_path}" alt="${movie.title}">
          <div class="rating">Rating : ${movie.vote_average}</div>
          <div class="overview">${movie.overview}</div>
        `;
        moviess.appendChild(movieElement);
       movieElement.addEventListener('click', function() {
          const movieId = this.dataset.movieId;
          fetch(`https://api.themoviedb.org/3/movie/${movieId}?api_key=3fd2be6f0c70a2a598f084ddfb75487c`)
            .then(response => response.json())
            .then(data => {
              const modalElement = document.createElement('div');
              modalElement.className = 'modal';
              modalElement.innerHTML = `
                <div class="modal-content">
                  <span class="close">&times;</span>
                  <h2>${data.title}</h2>
                  <img src="https://image.tmdb.org/t/p/w500/${data.poster_path}" alt="${data.title}">
                  <p>${data.overview}</p>
                </div>
              `;
              document.body.appendChild(modalElement);
              const closeButton = modalElement.querySelector('.close');
              closeButton.addEventListener('click', function() {
                modalElement.remove();
              });
            })
            .catch(error => {
              console.log(error);
            });
        });
      });
    })
    .catch(error => {
      console.log(error);
    });
}
