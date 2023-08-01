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

## <img src="mediafiles/icons/Jenkins.svg" title="Jenkins" width="4%"/> Jenkins

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

## <img width="4%" style="vertical-align:middle" title="Telegram" src="mediafiles/icons/Telegram.svg"> Отправка уведомления в Telegram

<p align="center">
<img width="70%" title="Telegram Notifications" src="mediafiles/screenshots/telegram.png">
</p>

## Видео пример запуска тестов в Selenoid

<p align="center">
  <img title="Selenoid Video" src="mediafiles/screenshots/test.gif">
</p>
