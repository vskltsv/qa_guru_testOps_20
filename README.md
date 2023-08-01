# Проект по автоматизации тестирования для компании [X5Group](https://www.x5.ru/ru/)

> X5 Group1 — ведущая розничная компания с внушительным портфелем сервисов: от сетей розничной торговли до цифровых и медийных платформ.

## **Содержание:**
____

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Примеры автоматизированных тест-кейсов</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>

____
<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="mediafiles/icons/Intelij_IDEA.svg">
<img width="6%" title="Java" src="mediafiles/icons/Java.svg">
<img width="6%" title="Selenide" src="mediafiles/icons/Selenide.svg">
<img width="6%" title="Selenoid" src="mediafiles/icons/Selenoid.svg">
<img width="6%" title="Allure Report" src="mediafiles/icons/Allure_Report.svg">
<img width="5%" title="Allure TestOps" src="mediafiles/icons/AllureTestOps.svg">
<img width="6%" title="Gradle" src="mediafiles/icons/Gradle.svg">
<img width="6%" title="JUnit5" src="mediafiles/icons//JUnit5.svg">
<img width="6%" title="GitHub" src="mediafiles/icons/GitHub.svg">
<img width="6%" title="Jenkins" src="mediafiles/icons/Jenkins.svg">
<img width="6%" title="Telegram" src="mediafiles/icons/Telegram.svg">
<img width="5%" title="Jira" src="mediafiles/icons/Jira.svg">
</p>

### Запуск из терминала

```
gradle clean test -Denv=local 
```

```
gradle clean test -Denv=remote
```

***Удалённый запуск через Jenkins:***
```bash  
clean remote_test
"-Dbrowser=${browser}"
"-DbrowserVersion=${browserVersion}"
"-DbrowserSize=${browserSize}"
"-DbaseUrl=${baseUrl}"
"-DremoteUrl=${remoteUrl}"
```
<a id="jenkins"></a>
## <img src="mediafiles/icons/Jenkins.svg" title="Jenkins" width="4%"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/vskltsv_allure_testOps_20/)</a>

<p align="center">
<img title="Jenkins Build" src="mediafiles/screenshots/jenkins.png">
</p>

## <img src="mediafiles/icons/Allure_Report.svg" title="Allure Report" width="4%"/> Allure-отчет

### Overview

<p align="center">
<img title="Allure Overview" src="mediafiles/screenshots/allureReport.png">
</p>

## <img src="mediafiles/icons/AllureTestOps.svg" title="Allure TestOps" width="4%"/> Allure TestOps

<p align="center">
<img title="Allure TestOps DashBoard" src="mediafiles/screenshots/allureTestOps.png">
</p>

## <img src="mediafiles/icons/Jira.svg" title="Jira" width="4%"/> Jira

<p align="center">
<img title="Jira Task" src="mediafiles/screenshots/jira.png">
</p>

<a id="telegram"></a>
## <img alt="Allure" height="25"  src="mediafiles/icons/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="mediafiles/screenshots/Telegram.png" width="550">  
</p>

____
<a id="video"></a>
## <img alt="Selenoid" height="25" src="mediafiles/screenshots/test.gif" width="25"/></a> Пример видео выполнения тестов на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="mediafiles/icons/Selenoid.svg" width="550" height="350"  alt="video">   
</p>
