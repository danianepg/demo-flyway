# Flyway

## A brief overview

![](https://miro.medium.com/max/2608/0*AxUkaktW_0wpB4-p)

Photo by  [Federico Fioravanti](https://unsplash.com/@t__o__r__q__u__e?utm_source=medium&utm_medium=referral)  on  [Unsplash](https://unsplash.com/?utm_source=medium&utm_medium=referral)

----------

[_This is part of a bigger story_](https://medium.com/@danianepg/database-migrations-with-liquibase-and-flyway-5946379c7738)_._

----------

[Flyway](https://flywaydb.org/) uses the old but gold SQL and the migrations are applied based on files’ name order. For instance,  _V1_1_0__person.sql_  will be applied before  _V1_2_0__data.sql_.

The name after “____” does not really matter and once a script is executed, you can not change the file anymore.

It can be executed when Spring Boot starts up the application, through Maven command or command line.

On  [my demo project](https://github.com/danianepg/demo-flyway)  it is possible to check the following:

-   Migration instructions on folder  _src/main/resources/db/migration._
-   Flyway configurations on file  _src/main/resources/_flywayConfig.properties
-   Maven plugin for Flyway on  _pom.xml_

The main commands are below.

Commands for Maven plugin

Flyway also creates one control table on the database where it is possible to watch the changes.

![](https://miro.medium.com/max/217/1*BueuSZJHiZC6OYZU18F0GQ.png)

Database tables

![](https://miro.medium.com/max/1214/1*sp2QDI9iC_6s0HvO70nZBQ.png)

Control records

----------

[_Get back to the bigger story._](https://medium.com/@danianepg/database-migrations-with-liquibase-and-flyway-5946379c7738)

[_Originally posted on my Medium stories._](https://medium.com/@danianepg/flyway-b91f53debede?source=friends_link&sk=8535e07de61e84ba6ecce0bff818d02a)
