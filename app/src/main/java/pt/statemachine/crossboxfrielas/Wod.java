package pt.statemachine.crossboxfrielas;

public class Wod {
    private String name;
    private String description;
    private int imageResourceId;

    //wods is an array of Wods
    public static final Wod[] wods = {
            new Wod("Barbara",
                    "5 ROUND 3 MIN REST\n\n20 Pull-ups\n30 Push-ups\n40 Sit-ups\n50 Squats",
                    R.drawable.barbara),
            new Wod("Chelsea",
                    "EMOM FOR 30 MIN\n\n5 Pull-ups\n10 Push-ups\n15 Squats",
                    R.drawable.chelsea),
            new Wod("Mary",
                    "AMRAP 20 MIN\n\n5 Handstand push-ups\n10 single leg squats\n15 Pull-ups",
                    R.drawable.mary),
            new Wod("Cindy",
                    "AMRAP 20 MIN\n\n5 Pull-ups\n10 Push-ups\n15 Squats",
                    R.drawable.cindy),
            new Wod("Annie",
                    "50 40 30 20 10\n\nDouble unders\nSit-ups",
                    R.drawable.annie),
            new Wod("Nicole",
                    "AMRAP 20 MIN\n\n400m run\nMax rep pull-ups",
                    R.drawable.nicole),
            new Wod("Angie",
                    "AFAP\n\n100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats",
                    R.drawable.angie),
            new Wod("Eva",
                    "5 ROUNDS\n\n800m run\n30 Kettlebell swings (32 Kg)\n30 Pull-ups",
                    R.drawable.eva),
            new Wod("Helen",
                    "3 ROUNDS\n\n400m run\n21 Kettlebell swings (24 Kg)\n12 Pull-ups",
                    R.drawable.helen),
            new Wod("Kelly",
                    "5 ROUNDS\n\n400m run\n30 Box jumps (60 cm)\n30 Wall balls (9 Kg)",
                    R.drawable.kelly),
            new Wod("Karen",
                    "AFAP\n\n150 Wall balls (9 Kg)",
                    R.drawable.karen),
            new Wod("Amanda",
                    "9-7-5\n\nMuscle ups\nSnatch (60 Kg)",
                    R.drawable.amanda),
            new Wod("Jackie",
                    "AFAP\n\n1000m row\n50 Thrusters (20 Kg)\n30 Pull-ups",
                    R.drawable.jackie),
            new Wod("Diane",
                    "21-15-9\n\nDeadlift (100 Kg)\nHandstand push-ups",
                    R.drawable.diane),
            new Wod("Fran",
                    "21-15-9\n\nThrusters (45 Kg)\nPull-ups",
                    R.drawable.fran),
            new Wod("Elizabeth",
                    "21-15-9\n\nCleans (60 Kg)\nRing Dips",
                    R.drawable.elizabeth),
            new Wod("Nancy",
                    "5 ROUNDS\n\n400m run\n15 Overhead Squats (45 Kg)",
                    R.drawable.nancy),
            new Wod("Lynne",
                    "5 ROUNDS MAX REPS\n\nBench press (body weight)\nPull-ups",
                    R.drawable.lynne),
            new Wod("Isabel",
                    "AFAP\n\n30 Snacths (60 Kg)",
                    R.drawable.isabel),
            new Wod("Linda",
                    "10/9/8/7/6/5/4/3/2/1\n\nDeadlift (1/2 body weight)\nBench Press (body weight)\nClean (3/4 body weight)",
                    R.drawable.linda),
            new Wod("Isabel",
                    "AFAP\n\n30 Clean and Jerks (60 Kg)",
                    R.drawable.isabel)
    };
    //Each Wod has a name and description
    private Wod(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String toString() {
        return this.name;
    }
}