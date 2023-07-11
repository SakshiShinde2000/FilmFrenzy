package com.axis.filmfrenzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.axis.filmfrenzy.utils.FileUploadProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileUploadProperties.class
})
public class MultiplexBookingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplexBookingBackendApplication.class, args);
	}

}
