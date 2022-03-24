package com.lakesidemutual.policymanagement.interfaces.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The SwaggerConfiguration class configures the HTTP resource API documentation
 * that is generated by Springfox.
 */
@Configuration
public class SwaggerConfiguration {

	@Bean
	public OpenAPI customerSelfServiceApi() {
		return new OpenAPI()
				.info(new Info().title("PolicyManagement API")
						.description("This API allows LM staff to manage the policies of their customers.")
						.version("v1.0.0")
						.license(new License().name("Apache 2.0")));
	}
}