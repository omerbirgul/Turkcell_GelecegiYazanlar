package org.manager.entities;


import java.util.HashMap;
import java.util.Map;

public class Customer extends BaseEntity<Integer> {
        private String identityNumber;
        private String firstName;
        private String lastName;

        private Map<String, Object> properties = new HashMap<>();


        //default constructor
        public Customer(){

        }

        public Customer(String identityNumber,String firstName,String lastName){
                this.identityNumber = identityNumber;
                this.firstName =  firstName;
                this.lastName = lastName;
        }

        public Customer(String identityNumber,String firstName,String lastName,int starCount){
                this.identityNumber = identityNumber;
                this.firstName =  firstName;
                this.lastName = lastName;
                this.setProperty("stars",starCount);
                this.setProperty("isValid",false);
        }

        public String getIdentityNumber() {
                return identityNumber;
        }

        public void setIdentityNumber(String identityNumber) {
                this.identityNumber = identityNumber;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public void setProperty(String key, Object value) {
                properties.put(key, value);
        }

        public Object getProperty(String key) {
                return properties.get(key);
        }

        public String getFullName(){
                return this.firstName + " " + this.lastName;
        }
}
