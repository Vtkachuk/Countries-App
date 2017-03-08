package countries.countryapp;

/**
 * Created by Vtkachuk on 16-10-08.
 */
public class Country {
        public Country(String path, String name, String capitalName, String continent){
                this.path = path;
                this.name = name;
                this.capitalName = capitalName;
                this.continent = continent;
        }
        public String path;
        public String name;
        public String capitalName;
        public String continent;

}
