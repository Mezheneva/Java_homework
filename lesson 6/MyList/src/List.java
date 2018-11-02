public interface List {
    void add(Object obj, int index); //добавляет объект на указанную позицию (index)
    void remove(int index); //удаляет элемент с указанной позиции (index)
    Object get(int index);
    int size();
}
