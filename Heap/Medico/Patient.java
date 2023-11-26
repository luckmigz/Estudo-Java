package Heap.Medico;


class Patient {
    private String name;
    private int age;
    private boolean isPregnantOrPostpartum;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Patient(String name, int age, boolean isPregnantOrPostpartum) {
        this.name = name;
        this.age = age;
        this.isPregnantOrPostpartum = isPregnantOrPostpartum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isPregnantOrPostpartum() {
        return isPregnantOrPostpartum;
    }

    
}