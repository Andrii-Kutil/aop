Проблемы с которыми сталкиваемся:
1)переплетение бизнес логики с служебным функционалом
2)разбросанность служебного функционала по всему проекта

Это парадигма программирования, основанна на идеи разделения основного и служебного кода.
К служебному относится: логирование, проперка прав, обработка исключений.

В итоге, есть метод бизнес логики, он обращается к прокси, прокси уже обращается к аспекту который содержит служебный код.

Плюшки:
1)Сквозной функционал размещать в одном месте.
2)Становится легче добавлять новый сквозной функционал.
3)Бизнес код исбавляется от лишнего кода
Минус:
1)Дополнительное время на работу аспектов.
--------------------------------------------------------------------------
AOP frameworks
Spring AOP(простое) and AspectsJ(непростое)
--------------------------------------------------------------------------
Before - выполняется до метода с основной логики
After returning - выполняется после успешного окончания метода в основной логики, можно изменять возращаемое значение
After throwing - выполняется после окончания метода с основной логикой только если было выброшено исключение, можно перехватить ошибку в адвайсе
After/After finally - выполняется после окончания метода с основной логикой
Around - главная фишка в том что можно использовать proceed() етод, получить результат, обработать ошибку и т.д.
Указываем:
1)в аргументе адвайс метода ProceedingJoinPoint. Это связь с таргет методом.
2)указываем возвращаемый тип у адвайса как у таргета.
3)вызываем метод proceed и возвращаем результат этого метода.
--------------------------------------------------------------------------
Advice - это метод который находится в Аспекте и содержит сквозную логику.
Advice определяет что и когда должно происходить. В идеале должен быть небольшим и быстро работающим.
--------------------------------------------------------------------------
Pointcut - выражение, описывающее где должен быть применен Advice, на каком методе. Пример: ("execution(public void getBook())")
Есть определенный патерн как конфигурировать обьявление.
--------------------------------------------------------------------------
Что бы контролировать порядок аспектов их нужно разместить в разных классах и аннотация @Order
--------------------------------------------------------------------------
Join Point это точка.момент в выполняемой программе когда следует применять Advice.
С Join Point можно получить:
1)сигнатуру метода
2)информацию о параметрах этих методов, что передали в него
3)return type
--------------------------------------------------------------------------