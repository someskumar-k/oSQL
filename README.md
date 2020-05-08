# oSQL
### Make your java code more Object Oriented by creating your database queries as Java Objects
  This project is to create an efficient and easy to use object relational model with an inbuilt query optimizing principles
and a extended support for all relational databases.
  >Write a Query Once and Use it for all databases

### Principles
  1. Object Oriented
  2. Simple and Transparent
  3. Maximum controll over Query Objects
  4. Inbuilt Optimization for sql query ( ML Concepts )
  5. Query Reusability

These are key principles that I aim to develop in this package. If you are intrested you are welcomed to contribute
### Releases
  [v0.0.1-beta](https://github.com/Someskumarasamy/oSQL/releases/download/V0.0.1-beta/oSQL.zip)
## UpComming Features
  1. Where Condition
  1. Alias Support
  1. Presist Functionality

## How to Use 

## Select Query
  1. **Create a new Select Query**
      ```
      SelectQuery query_object = new SelectQuery( <Base_Table_Name>);
      ```
      returns a query object for the base table. similar to *`select * from Base_Table_Name ;`*
      
 2. **Create / Add a select column** 
     ```
     query_object.addColumn(<Column_Name>);
     ```
     add the <Column_Name> to the select query, if the column belongs to base table.
     ```
     query_object.addColumn(<tablename>,<columnname>);
     ```
     Add the columns of different tables to the query.
 
 3. **Get Query String**
     ```
     query_object.toString()
     ```
     returns the query as string, it can be used to excecute
     
## Joins 

  1. **Create Join**
     ```
       Join join_object = new Join(<Table Name>);
     ```
       returns a Join object which uses the <Table Name> as Inital Base Table and this object will be the parent for all joins,
       you can add, remove joins in this
       
  2. **Create / Appending Sub Joins**
     ```
      join_object.add(new FullJoin(base-table, new-table, base-colum, new-column));
      join_object.add(new RightJoin(base-table, new-table, base-colum, new-column));
      join_object.add(new LeftJoin(base-table, new-table, base-colum, new-column));
      join_object.add(new InnerJoin(base-table, new-table, base-colum, new-column));
     ```
      This used to append multiple joins in join_object. this will take a Join Object as paramenter
      
  3. **Adding Join in Select Query**
     ```
       query_object.append(join_object)
     ```
       append the join string in the select query object.
  4. **Remove a subjoin in join**
    
      To imporve the reusability the join_object can remove the sub joins that are appended to it, provided if the joins new-table
      is not used as base table in the query
      ```
      join_object.remove(new-table)
      ```
   
