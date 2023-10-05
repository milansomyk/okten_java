package task3;

public enum SkillTitles {
    JAVA("java"),JS("js"),CPP("c++");
     public String skill;

    SkillTitles(String skill) {
         this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }
}
