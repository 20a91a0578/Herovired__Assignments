import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
       Scanner br=new Scanner(System.in);

        char fl;
        do {
            int choice = 0;
            String filePath = null;
            String folderPath = null;
            String fileName = null;
            String fileContent = null;
            File file = null;
            boolean success = false;
            try {
                System.out.println("Menu based app - File Operations in Java");
                System.out.println("1. Create a new folder");
                System.out.println("2. Create a new text file");
                System.out.println("3. Write into a text file");
                System.out.println("4. Append data to a text file");
                System.out.println("5. Rename a file");
                System.out.println("6. Delete a file");
                System.out.print("Please enter the Menu: ");
                choice =br.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.println("Please enter the Folder-name to be Created: ");
                        String foldername=br.next();
                        
                        System.out.println("Enter the folder path: ");
                        folderPath = br.next();
                        String jk=folderPath+foldername;
                        success = new File(jk).mkdir();
                        if (success) {
                            System.out.println("Folder created successfully.");
                        } else {
                            System.out.println("Folder creation failed.");
                        }
                        break;
                    
                    case 2:
                        System.out.println("Enter the folder path: ");
                        folderPath = br.next();
                        System.out.println("Enter the file name: ");
                        fileName = br.next();
                        System.out.println(folderPath);
                        file = new File(folderPath + File.separator + fileName+".txt");
                        success = file.createNewFile();
                        if (success) {
                            System.out.println("File created successfully.");
                        } else {
                            System.out.println("File creation failed.");
                        }
                        break;
                        
                    case 3:
                        System.out.println("Enter the file path: ");
                        filePath = br.next();
                        System.out.println("Enter the file content: ");
                        fileContent = br.next();
                        FileWriter writer = new FileWriter(filePath);
                        writer.write(fileContent);
                        writer.close();
                        System.out.println("Content written to the file successfully.");
                        break;
                        
                    case 4:
                        System.out.println("Enter the file path: ");
                        filePath = br.next();
                        System.out.println("Enter the file content to append: ");
                        fileContent = br.next();
                        FileWriter appendWriter = new FileWriter(filePath, true);
                        appendWriter.write(fileContent);
                        appendWriter.close();
                        System.out.println("Content appended to the file successfully.");
                        break;
                        
                    case 5:
                        System.out.println("Enter the file path: ");
                        filePath = br.next();
                        System.out.println("Enter the new file name: ");
                        fileName = br.next();
                        File newFile = new File(filePath);
                        success = newFile.renameTo(new File(newFile.getParent() + File.separator + fileName));
                        if (success) {
                            System.out.println("File renamed successfully.");
                        } else {
                            System.out.println("File renaming failed.");
                        }
                        break;
                        
                    case 6:
                        System.out.println("Enter the file path: ");
                        filePath = br.next();
                        file = new File(filePath);
                        success = file.delete();
                        if (success) {
                            System.out.println("File deleted successfully.");
                        } else {
                            System.out.println("File deletion failed.");
                        }
                        break;
                        
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                            System.out.println("Error: Invalid choice entered. Please enter a number between 1 and 6.");
        } catch (SecurityException e) {
            System.out.println("Error: Security exception occurred. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.print("Press 'Y' to go back to the Main File-Operations Menu: ");
        fl=br.next().charAt(0);
    }while(fl=='y'||fl=='Y');
    br.close();
}
}
               
