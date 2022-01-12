# COSC 404 - Database System Implementation<br>Lab 5 - Query Parsing with JavaCC

This lab practices parsing using JavaCC.

## Query Parsing with JavaCC (20 marks)

This question uses the JavaCC parser to translate SQL queries into execution plans.  [JavaCC](https://javacc.org/) is a Java-based parser generator.  You can use it to make parse trees using the JJTree component.  Read the [JJTree getting started tutorial](https://javacc.org/jjtree) for an explanation on JJTree.

Our goal is to add ORDER BY support to the current system.  The code already supports a basic SQL parser in the file `parser/SQLparser.jjt` and a translation directly from the parse tree to an execution tree (using operators like you developed in assignment #3 in the file query/Optimizer.java.

A setup and getting started checklist:

- [Download and install JavaCC](https://javacc.org/) on your machine.

- The test file is `junit/TestQuery.java`.

- Modify the `parser/SQLParser.jjt` file to support an ORDER BY clause of the form `ORDER BY attrName [ASC | DESC], (attrName [ASC | DESC])*`. You only will specify attribute names (no expressions) and must support if no ASC/DESC is specified (in which case it defaults to ASC).  There may be more than one attribute requested by the ORDER BY. (10 marks)

- Modify the `query/Optimizer.java` file to support execution of the ORDER BY clause you just created.  Note that we will limit support to only one attribute either ASC or DESC. (10 marks)

