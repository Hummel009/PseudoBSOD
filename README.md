Программа для развлечения. Выводит изображение синего экрана смерти поверх всех окон. Закрыть его невозможно (точнее можно, но лишь диспетчером задач - но наш синий экран поверх всех окон, включая диспетчер).

## Общая информация

Этот репозиторий - проект Gradle, который должен быть открыт через IntelliJ IDEA. После установки среды проконтролируйте, чтобы версии Gradle JVM и JDK соответствовали указанным ниже, иначе есть вероятность, что установка пройдёт некорректно.

| Технология | Версия  | Пояснение                                    | Где настроить                                                    |
|------------|---------|----------------------------------------------|------------------------------------------------------------------|
| Gradle     | 8.4-bin | Версия системы автоматической сборки         | -                                                                |
| Gradle JVM | 17.0.9  | Версия Java, используемая для запуска Gradle | File -> Settings -> Build -> Build Tools -> Gradle -> Gradle JVM |
| Kotlin     | 1.9.20  | Версия Kotlin, используемая в проекте        | -                                                                |
| JDK        | 17.0.9  | Версия SDK, используемая в проекте           | File -> Project Structure -> Project -> SDK                      |

Если значения не соответствуют необходимым, необходимо перезагрузить проект Gradle. Ниже об этом будет написано подробнее.

## Установка и основы работы

Собственно, для начала нужно скачать репозиторий и разархивировать его в любое место на диске. Полученную папку будем называть **папкой проекта**. В этой папке лежат папки (gradle, src) и различные файлы.

Первым делом, запустите IntelliJ IDEA и откройте папку проекта: `File -> Open -> [Выбираете папку]`. Сразу после открытия начнётся установка среды. Если от вас потребуется разрешение на скачивание файлов, дайте его. Спустя некоторое время все необходимые файлы скачаются, и среда будет готова к работе.

Если на этом моменте что-то пошло не так, значит, самое время проверить значения, указанные в таблице из первого раздела. После изменения этих значений необходимо перезагрузить проект Gradle. Это можно сделать в **меню Gradle**, нажав на циклические стрелки. Меню можно открыть, нажав на значок слона в верхней правой части окна.

## Использование

Запустить скомпилированный jar-файл двойным нажатием ЛКМ, либо открыть консоль Windows в папке с jar-файлом и выполнить команду `java -jar JarFileName.jar`.
