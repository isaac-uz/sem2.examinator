class Factory {

    static Greeter englishGreeter() {
        return new Greeter() {
            @Override
            String greet(String name) {
                return "Good Afternoon " + name + "!";
            }
        };
    }

    static Greeter germanGreeter() {
        return new Greeter() {
            @Override
            String greet(String name) {
                return "Guten tag " + name + "!";
            }
        };
    }
}

abstract class Greeter {
    abstract String greet(String name);
}
