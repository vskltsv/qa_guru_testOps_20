# Проект по автоматизации тестирования для компании [X5Group](https://www.x5.ru/ru/)

> X5 Group — ведущая розничная компания с внушительным портфелем сервисов: от сетей розничной торговли до цифровых и
> медийных платформ.

## **Содержание:**

____

* <a href="#tools">Технологии и инструменты</a>


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


<a id="console"></a>

### Запуск из терминала

```
gradle clean  test -Denv=locallaunch     
```

```
gradle clean remote_test -Denv=remotelaunch   
```

***Удалённый запуск через Jenkins:***

```bash  
clean remote_test
"-Dbrowser=${BROWSER}" 
"-DbrowserSize=${BROWSER_SIZE}" 
"-DbrowserVersion=${BROWSER_VERSION}" 
"-DbaseUrl=${BASE_URL}"
"-DremoteUrl=${SELENOID}" 
```
### Параметры запуска

<code>browser</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).

<code>browserVersion</code> – версия браузера (_по умолчанию - <code>100</code>_).

<code>browserSize</code> – размер окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1920x1080</code>_).

<code>remoteURL</code> - адрес удаленного сервера, где будут запускаться тесты.

<code>baseUrl</code> - адрес базового урла тестируемого сайта.

<a id="jenkins"></a>

## <img src="mediafiles/icons/Jenkins.svg" title="Jenkins" width="4%"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/vskltsv_allure_testOps_20/)</a>

<p align="center">
<img title="Jenkins Build" src="mediafiles/screenshots/jenkins.png">
</p>


<a id="allure"></a>

## <img alt="Allure" height="25" src="mediafiles/icons/Allure_Report.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/vskltsv_allure_testOps_20/allure/)</a>

___

<p align="center">  
<img title="Allure Overview Dashboard" src="mediafiles/screenshots/allure-diplom.png" width="850">  
</p> 

<a id="allure-testops"></a>

## <img alt="Allure" height="25" src="mediafiles/icons/AllureTestOps.svg" width="25"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3593/dashboards">Allure TestOps</a>

<p align="center">  
<img title="Allure TestOps Dashboard" src="mediafiles/screenshots/allureOps-diplom.png" width="850">  
</p> 

<a id="jira"></a>

## <img alt="Allure" height="25" src="mediafiles/icons/Jira.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-862">Jira</a>

____
<p align="center">  
<img title="Jira" src="mediafiles/screenshots/jira-diplom.png" width="850">  
</p>


<a id="telegram"></a>

## <img alt="Allure" height="25"  src="mediafiles/icons/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота

____
<p align="center">  
<img title="Allure Overview Dashboard" src="mediafiles/screenshots/telegramm-diplom.png" width="550">  
</p>

____
<a id="video"></a>

## <img alt="Selenoid" height="25" src="mediafiles/icons/Selenoid.svg" width="25"/></a> Пример видео выполнения тестов на Selenoid

____
<p align="center">
<img title="Selenoid Video" src="mediafiles/screenshots/test.gif" width="550" height="350"  alt="video">   
</p>
