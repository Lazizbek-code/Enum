public enum Language {
    UZ, RU, EN;

    public static Language getByName(String languageName){
        for (Language language:values()){
            if (language.name().equalsIgnoreCase(languageName))
                return language;
        }

        return UZ;
    }
}
