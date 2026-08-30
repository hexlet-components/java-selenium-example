## Пример проекта для Java Selenium

Этот пример показывает минимальную структуру проекта с Selenium и JUnit. В проекте два простых теста: проверка заголовка страницы и проверка текста элемента. Оба наследуются от `BaseTest`, который создаёт браузер перед каждым тестом и закрывает его после.

## Структура проекта

```text
java-selenium-example/
├── .github/
│   └── workflows/
│       └── javaci.yml
├── build.gradle.kts
├── settings.gradle.kts
├── gradle/
│   └── libs.versions.toml
├── Makefile
└── src/
    └── test/
        └── java/
            └── example/
                ├── BaseTest.java
                ├── SmokeTest.java
                └── ElementTest.java
```

## Как запустить тесты

1. Установить JDK и Gradle по инструкции: <https://github.com/Hexlet/ru-instructions/blob/main/java.md>
2. Перейти в каталог _java-selenium-example_
3. Установить зависимости:

```bash
make install
```

4. Запустить тесты:

```bash
make test
```

После запуска Gradle создаст каталог _build/_ и выведет статус `BUILD SUCCESSFUL`. Отчёт о прогоне лежит в _build/reports/tests/test_.

Браузер по умолчанию запускается без окна. Чтобы посмотреть, что делает тест, окно включается переменной окружения:

```bash
HEADLESS=false make test
```

## Прогон в CI

Пайплайн описан в _.github/workflows/javaci.yml_ и делает три шага: ставит JDK, прогоняет `./gradlew test spotlessCheck` и выкладывает отчёт о тестах как артефакт сборки. Дисплея на раннере нет, поэтому браузер там идёт без окна.

Драйвер отдельно ставить не нужно: Selenium Manager сам подбирает и кеширует chromedriver под установленный Chrome. Если подходящего Chrome в системе нет, он скачивает сборку Chrome for Testing. Первый запуск из-за этого дольше остальных.
