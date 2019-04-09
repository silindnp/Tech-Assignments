package com.ayospringboot.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ayospringboot.test.repository.UnitsRepository;
import com.ayospringboot.test.dto.UnitsModel;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UnitsRepository repository) {
	    return args -> {
	        repository.save(new UnitsModel("km-mile","Kilometer to Mile", "http://[hostserver]/convertunits/[ValueOfKilometer]/km-mile", "Replace [] with correct values"));
	        repository.save(new UnitsModel("mile-km","Mile to Kilometer", "http://[hostserver]/convertunits/[ValueOfMile]/mile-km", "Replace [] with correct values"));
	        repository.save(new UnitsModel("Cel-Fahr","Celsius to Fahrenheit", "http://[hostserver]/convertunits/[ValueOfCelsius]/Cel-Fahr", "Replace [] with correct values"));
	        repository.save(new UnitsModel("Fahr-Cel","Fahrenheit to Celsius", "http://[hostserver]/convertunits/[ValueOfFahrenheit]/Fahr-Cel", "Replace [] with correct values"));
	        repository.save(new UnitsModel("st-t","Short Tone to Tone", "http://[hostserver]/convertunits/[ValueOfShortTone]/st-t", "Replace [] with correct values"));
	        repository.save(new UnitsModel("t-st","Tone to Short Tone", "http://[hostserver]/convertunits/[ValueOfTone]/t-st", "Replace [] with correct values"));
	        repository.save(new UnitsModel("kg-lb","Kilogram to Pound", "http://[hostserver]/convertunits/[ValueOfKilogram]/kg-lb", "Replace [] with correct values"));
	        repository.save(new UnitsModel("lb-kg","Pound to Kilogram", "http://[hostserver]/convertunits/[ValueOfPound]/lb-kg", "Replace [] with correct values"));
	        repository.save(new UnitsModel("l-gal","liter to Gallon", "http://[hostserver]/convertunits/[ValueOfLiter]/l-gal", "Replace [] with correct values"));
	        repository.save(new UnitsModel("gal-l","Gallon to liter", "http://[hostserver]/convertunits/[ValueOfGallon]/gal-l", "Replace [] with correct values"));
	    };
	}
}
