package ss15_io_text_file.exercise.read_file_csv;

public class Countries {
    private int stt;
    private String abbreviations;
    private String countryName;

    public Countries() {
    }

    public Countries(int stt, String abbreviations, String countryName) {
        this.stt = stt;
        this.abbreviations = abbreviations;
        this.countryName = countryName;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getAbbreviations() {
        return abbreviations;
    }

    public void setAbbreviations(String abbreviations) {
        this.abbreviations = abbreviations;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "stt=" + stt +
                ", abbreviations='" + abbreviations + '\'' +
                ", CountryName='" + countryName + '\'' +
                '}';
    }
    public String readCountriesListFromFile(){
        return this.stt+","+this.abbreviations+","+this.countryName;
    }
}
