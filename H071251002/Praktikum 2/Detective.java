class Detective {
    String name;
    int skill;
    Case currentCase;

    Detective() {
        this.name = "Unknown";
        this.skill = 0;
        this.currentCase = new Case("No Case");
    }


    Detective(String name, int skill, Case currentCase) {
        this.name = name;
        this.skill = skill;
        this.currentCase = currentCase;
    }

    public void solveCase() {
        System.out.println(name + " menyelesaikan kasus : " + currentCase.caseName);
    }

    public void compareSkill(Detective other) {
        if (this.skill > other.skill) {
            System.out.println(this.name + " lebih jago dari " + other.name);
        } else {
            System.out.println(other.name + " lebih jago dari " + this.name);
        }
    }
}