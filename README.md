## Пример проекта для Java Selenium

Этот пример показывает минимальную структуру проекта с Selenium и JUnit. В проекте два простых теста: проверка заголовка страницы и проверка текста элемента.

## Структура проекта

```text
java-selenium-example/
├── build.gradle.kts
├── settings.gradle.kts
├── Makefile
└── src/
    └── test/
        └── java/
            └── example/
                ├── SmokeTest.java
                └── ElementTest.java
```

## Как запустить тесты

1. Установить JDK и Gradle по инструкции: https://github.com/Hexlet/ru-instructions/blob/main/java.md
2. Перейти в каталог *java-selenium-example*
3. Установить зависимости:

```bash
make install
```

4. Запустить тесты:

```bash
make test
```

После запуска Gradle создаст каталог *build/* и выведет статус `BUILD SUCCESSFUL`.
