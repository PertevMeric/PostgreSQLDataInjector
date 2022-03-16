# PostgreSQLDataInjector
ABOUT PostgreSQLDataInjector

PostgreSQLDataInjector is a java rapplication that can INSERT your data to desired postgreSQL table, with a delimiter option.

Also you can EXPORT data from a table, and run a SHELL COMMAND from the application.

Program can access your both remote and local database, as configured in app.config file.

HOW TO RUN THE PROGRAM

First, clone the project into your IDE (preferably Intellij IDEA). 

Do a quick maven reload.

In Libraries section of your project, add the 

1. jsch-extension-jar-with-dependencies.jar
2. postgresql-42.2.23 (1).jar 
to your Libraries.

Then, Enter related field in the app.config in folder /src.

After that, do a quick maven reload again.

Finally, run the main from test.java.
