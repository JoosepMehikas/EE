public class DefaultValues {
    public enum PageTitles {
        MAINPAGE("Päikesepaneelid koju - vähenda elektriarvet ja hoia loodust - Eesti Energia"),;

        private String expectedValue;

        PageTitles(String expectedPageValue) {
            this.expectedValue = expectedPageValue;
        }

        public String getValue() {
            return expectedValue;
        }
    }

    public enum LowConsumptionExpectedValues {
        PACKAGE("Väikese tarbimise"),
        CONSUMPTION("Kuni 7 000 kWh/aastas"),
        AREA("40 m2"),
        POWER("5,25 kWp"),
        COST("7 535 €"),
        HIRE_COST("132 €/kuu"),
        OUTPUT("Kuni 4 990 kWh"),
        PANELS("14");

        private String expectedValue;

        LowConsumptionExpectedValues(String expectedLowValue) {
            this.expectedValue = expectedLowValue;
        }

        public String getValue() {
            return expectedValue;
        }
    }

    public enum TabHeadings {
        ENERGY_STORAGE("Päikesepaneelide lahendusega koos soovitame"),
        QUOTE_DETAILS("Valitud lahendus");

        private String expectedHeading;

        TabHeadings(String expectedTabHeading) {
            this.expectedHeading = expectedTabHeading;
        }

        public String getValue() {
            return expectedHeading;
        }
    }

    public enum MediumConsumptionExpectedValues {
        PACKAGE("Keskmine tarbimise"),
        POWER("7,5 kWp"),
        COST("9 690 €"),;

        private String expectedMediumValue;

        MediumConsumptionExpectedValues(String expectedMediumValue) {
            this.expectedMediumValue = expectedMediumValue;
        }

        public String getValue() {
            return expectedMediumValue;
        }
    }
}
