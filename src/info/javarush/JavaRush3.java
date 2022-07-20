package info.javarush;


public class JavaRush3 {

    public static void main(String[] args) {
        // создаем кота и выводим на экран чтоб убедиться, что он "пустой"
        Cat myCat = new Cat();
        System.out.println(myCat);

        // создаем лямбду
        Settable<Cat> s = (obj, name, age) -> {
            obj.setName(name);
            obj.setAge(age);
        };

        // вызываем метод, в который передаем кота и лямбду
        changeAnimal(myCat, s);
        // выводим на экран и видим, что состояние кота изменилось (имеет имя и возраст)
        System.out.println(myCat);
    }

    private static <T extends WithNameAndAge> void changeAnimal(T animal, Settable<T> s) {
        s.set(animal, "Мурзик", 3);
    }
}

interface WithNameAndAge {
    void setName(String name);

    void setAge(int age);
}

interface Settable<C extends WithNameAndAge> {
    void set(C entity, String name, int age);
}

class Cat implements WithNameAndAge {
    private String name;
    private int age;

//    public Cat(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        if (getName() != null && getAge() != 0)
            return "Cat по имени " + getName() + " [возраст: " + getAge() + "] ";
        else
            return "Список пуст";
    }
}



