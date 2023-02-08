package ru.yandex.practicum.contacts.presentation.base;

/*интерфейс, который заставит классы, описывающие элементы списка, реализовывать
методы для вычисления значения для метода areItemsTheSame() в методах с одинаковым названием*/
public interface ListDiffInterface<T> {
    boolean theSameAs(T item);

    @Override
    boolean equals(Object o); // true, если данные совпадают, и false, если нет
}
