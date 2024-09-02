import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/lenden";

    private static final String username = "root";

    private static final String password = "bangbang@1234";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load drivers ....
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


  /// *********** created query with Statement **********/////////////////////////////////

       // SELECT QUERY .....
//        try{
//            Connection connection = DriverManager.getConnection(url,username, password);
//            Statement statement = connection.createStatement();
//            String query = "select * from students";
//            ResultSet resultSet = statement.executeQuery(query); // when you retrieve the data from database then used executeQuery() methods..
//            while (resultSet.next()){
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                int age = resultSet.getInt("age");
//                double marks = resultSet.getDouble("marks");
//                System.out.println("ID : "+ id);
//                System.out.println("NAME : "+ name);
//                System.out.println("AGE : "+ age);
//                System.out.println("marks : "+ marks);
//            }
//
//        }catch (SQLException e){
//            System.out.println(e.getMessage());
//        }



     // INSERT QUERY....
//        try{
//            Connection connection = DriverManager.getConnection(url,username, password);
//            Statement statement = connection.createStatement();
//            String query = String.format("insert into students(name, age, marks) values('%s', %o, %f)", "Rahul", 23, 74.5);
//            int rowAffected = statement.executeUpdate(query); // when you insert the data from database then used executeUpdate() methods..
//            if(rowAffected > 0){
//                System.out.println("Data Inserted Successfully... ");
//            }else{
//                System.out.println("Data not Inserted");
//            }
//
//        }catch (SQLException e){
//            System.out.println(e.getMessage());
//        }



        // UPDATE QUERY ....
//        try{
//            Connection connection = DriverManager.getConnection(url,username, password);
//            Statement statement = connection.createStatement();
//            String query = String.format("update students set marks = %f where id = %d", 91.5, 2);
//            int rowAffected = statement.executeUpdate(query); // when you update the data from database then used executeUpdate() methods..
//            if(rowAffected > 0){
//                System.out.println("Data Updated Successfully... ");
//            }else{
//                System.out.println("Data not Updated");
//            }
//
//        }catch (SQLException e){
//            System.out.println(e.getMessage());
//        }



        // delete query...
//        try{
//            Connection connection = DriverManager.getConnection(url,username, password);
//            Statement statement = connection.createStatement();
//            String query = "delete from students where id = 2";
//            int rowAffected = statement.executeUpdate(query); // when you update the data from database then used executeUpdate() methods..
//            if(rowAffected > 0){
//                System.out.println("Data deleted Successfully... ");
//            }else{
//                System.out.println("Data not deleted");
//            }
//
//        }catch (SQLException e){
//            System.out.println(e.getMessage());
//        }



        /// *********** created query with PreparedStatement **********/////////////////////

        // INSERT QUERY...
//        try{
//            Connection connection = DriverManager.getConnection(url, username, password);
//            String query ="insert into students(name, age, marks) values(?, ?, ?)";
//            PreparedStatement preparedStatement= connection.prepareStatement(query);
//            preparedStatement.setString(1,"Ankita");
//            preparedStatement.setInt(2,25);
//            preparedStatement.setDouble(3,84.7);
//
//            int rowAffected = preparedStatement.executeUpdate();
//            if(rowAffected  >0){
//                System.out.println("Inserted data successfully.. ");
//            }else {
//                System.out.println("Data not Inserted....");
//            }
//
//        }catch (SQLException e){
//            System.out.println(e.getMessage());
//        }


        // SELECT QUERY...
//        try{
//            Connection connection = DriverManager.getConnection(url, username, password);
//            String query ="select marks from students where id = ?";
//            PreparedStatement preparedStatement= connection.prepareStatement(query);
//            preparedStatement.setInt(1, 1);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            if(resultSet.next()){
//                double marks = resultSet.getDouble("marks");
//                System.out.println("MARKS : "+marks);
//            }else {
//                System.out.println("MARKS NOT FOUND...");
//            }
//        }catch (SQLException e){
//            System.out.println(e.getMessage());
//        }


        // UPDATE QUERY..
//        try{
//            Connection connection = DriverManager.getConnection(url, username, password);
//            String query = "Update students set marks = ? where id = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setDouble(1, 92.66);
//            preparedStatement.setInt(2, 3);
//            int rowAffected = preparedStatement.executeUpdate();
//            if(rowAffected > 0){
//                System.out.println("Data Updated Successfully..");
//            }else {
//                System.out.println("Data Not Updated..");
//            }
//        }catch (SQLException e){
//            System.out.println(e.getMessage());
//        }

        // DELETE QUERY
//        try{
//           Connection connection = DriverManager.getConnection(url, username, password);
//           String query = "delete from students where name = ?";
//           PreparedStatement preparedStatement = connection.prepareStatement(query);
//           preparedStatement.setString(1,"Ankita");
//           int rowAffected = preparedStatement.executeUpdate();
//           if(rowAffected > 0){
//               System.out.print("Data Deleted Successfully..");
//           }else {
//               System.out.print("Data Not Deleted ");
//           }
//        }catch (SQLException e){
//            System.out.print(e.getMessage());
//        }

        // BATCH PROCESSING..
//        try{
//            Connection connection = DriverManager.getConnection(url, username, password);
//            Statement statement = connection.createStatement();
//            Scanner scanner=new Scanner(System.in);
//            while (true){
//                System.out.print("Enter name: ");
//                String name = scanner.next();
//                System.out.print("Enter age: ");
//                int age = scanner.nextInt();
//                System.out.print("Enter marks: ");
//                double marks = scanner.nextDouble();
//                System.out.println("Enter your data(Y/N): ");
//                String choice = scanner.next();
//                String query = String.format("insert into students(name, age, marks) values('%s', %d, %f)", name, age, marks);
//                statement.addBatch(query);
//                if(choice.toUpperCase().equals("N")) break;
//            }
//            int[] arr = statement.executeBatch();
//             for(int i=0; i<arr.length; i++) {
//                 if(arr[i] == 0){
//                     System.out.println("Query : "+i+" not executed successfully");
//                 }
//             }
//        }catch (SQLException e){
//            System.out.print(e.getMessage());
//        }


        // TRANSACTION HANDLING....
        try{
            Connection connection= DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false);
            String debit_query = "update accounts set balance = balance - ?  where account_number = ?";
            String credit_query = "update accounts set balance = balance + ? where account_number = ?";
            PreparedStatement debitPreparedStatement = connection.prepareStatement(debit_query);
            PreparedStatement creditPreparedStatement = connection.prepareStatement(credit_query);
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter Account Number: ");
            int account_number = scanner.nextInt();
            System.out.println("Enter Ammount: ");
            double amount = scanner.nextDouble();
            debitPreparedStatement.setDouble(1,amount);
            debitPreparedStatement.setInt(2,account_number);
            creditPreparedStatement.setDouble(1, amount);
            creditPreparedStatement.setInt(2,102);

            debitPreparedStatement.executeUpdate();
            creditPreparedStatement.executeUpdate();

            if(isSufficient(connection, account_number, amount)){
                connection.commit();
                System.out.println("Transaction Successfull");
            }else {
                connection.rollback();
                System.out.println("Transaction Failed");
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    static boolean isSufficient(Connection connection, int account_number, double ammount) {
        try {
            String query = "select balance from accounts where account_number = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, account_number);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                double current_balance = resultSet.getDouble("balance");
                if (ammount > current_balance) {
                    return false;
                } else {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}