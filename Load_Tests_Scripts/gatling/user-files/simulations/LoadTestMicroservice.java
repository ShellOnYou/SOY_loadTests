import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.core.body.*;
import io.gatling.javaapi.jdbc.*;

import io.gatling.http.response.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

import io.gatling.core.Predef.*;
import io.gatling.http.Predef.*;
//import scala.concurrent.duration.*;

import java.nio.file.Paths;

public class LoadTestMicroservice extends Simulation {

  {
    FeederBuilder csvFeeder = csv(Paths.get("appmshttp1/users.csv").toString()).circular();

    HttpProtocolBuilder httpProtocol = http
      .baseUrl("http://192.168.3.136:5001/")
      .inferHtmlResources()
      .acceptHeader("*/*")
      .acceptEncodingHeader("gzip, deflate")
      .acceptLanguageHeader("fr,fr-FR;q=0.8,en-US;q=0.5,en;q=0.3")
      .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/111.0");
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
    headers_0.put("If-None-Match", "\"f481ca8911910b371ec32d820b6a3fad7492b0b3\"");
    headers_0.put("Sec-Fetch-Dest", "document");
    headers_0.put("Sec-Fetch-Mode", "navigate");
    headers_0.put("Sec-Fetch-Site", "none");
    headers_0.put("Sec-Fetch-User", "?1");
    headers_0.put("Upgrade-Insecure-Requests", "1");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("If-None-Match", "\"05ce006a194c503f6d4ab5e8be0fb2ea6b219645\"");
    headers_1.put("Sec-Fetch-Dest", "script");
    headers_1.put("Sec-Fetch-Mode", "no-cors");
    headers_1.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_2 = new HashMap<>();
    headers_2.put("If-None-Match", "\"0328c12f2ad08d2ae8cc2d7feab8def96fe171ad\"");
    headers_2.put("Sec-Fetch-Dest", "script");
    headers_2.put("Sec-Fetch-Mode", "no-cors");
    headers_2.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("Accept", "text/css,*/*;q=0.1");
    headers_3.put("If-None-Match", "\"9dd7a38ef142430effaae977766138604e05a603\"");
    headers_3.put("Sec-Fetch-Dest", "style");
    headers_3.put("Sec-Fetch-Mode", "no-cors");
    headers_3.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_4 = new HashMap<>();
    headers_4.put("Accept", "application/json");
    headers_4.put("Content-Type", "application/json");
    headers_4.put("If-Modified-Since", "Fri, 25 Mar 2022 17:45:46 GMT");
    headers_4.put("If-None-Match", "\"1648230346546\"");
    headers_4.put("Sec-Fetch-Dest", "empty");
    headers_4.put("Sec-Fetch-Mode", "cors");
    headers_4.put("Sec-Fetch-Site", "cross-site");
    
    Map<CharSequence, String> headers_5 = new HashMap<>();
    headers_5.put("Access-Control-Request-Headers", "cache-control");
    headers_5.put("Access-Control-Request-Method", "GET");
    headers_5.put("Origin", "http://192.168.3.136:3001/");
    headers_5.put("Sec-Fetch-Dest", "empty");
    headers_5.put("Sec-Fetch-Mode", "cors");
    headers_5.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_6 = new HashMap<>();
    headers_6.put("If-None-Match", "\"25f39dbe22d493ac077eb70956a9f09efbb9a18f\"");
    headers_6.put("Sec-Fetch-Dest", "empty");
    headers_6.put("Sec-Fetch-Mode", "cors");
    headers_6.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_7 = new HashMap<>();
    headers_7.put("Accept", "application/json, text/plain, */*");
    headers_7.put("Cache-Control", "no-cache");
    headers_7.put("Content-Language", "en");
    headers_7.put("If-None-Match", "W/\"f-n9L/T8H7FjcXU5+wSuxCD+6xHlo\"");
    headers_7.put("Origin", "http://192.168.3.136:3001/");
    headers_7.put("Sec-Fetch-Dest", "empty");
    headers_7.put("Sec-Fetch-Mode", "cors");
    headers_7.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_8 = new HashMap<>();
    headers_8.put("Accept", "image/avif,image/webp,*/*");
    headers_8.put("Sec-Fetch-Dest", "image");
    headers_8.put("Sec-Fetch-Mode", "no-cors");
    headers_8.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_10 = new HashMap<>();
    headers_10.put("Accept", "image/avif,image/webp,*/*");
    headers_10.put("If-None-Match", "\"9da1abafe9e7b0a5ae391b3aafb626d59202216d\"");
    headers_10.put("Sec-Fetch-Dest", "image");
    headers_10.put("Sec-Fetch-Mode", "no-cors");
    headers_10.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_11 = new HashMap<>();
    headers_11.put("Accept", "application/json, text/plain, */*");
    headers_11.put("Cache-Control", "no-cache");
    headers_11.put("Content-Language", "en");
    headers_11.put("If-None-Match", "W/\"1c63-R04y/imzlLgS5JbKSeFcC6vVXCw\"");
    headers_11.put("Origin", "http://192.168.3.136:3001/");
    headers_11.put("Sec-Fetch-Dest", "empty");
    headers_11.put("Sec-Fetch-Mode", "cors");
    headers_11.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_12 = new HashMap<>();
    headers_12.put("Access-Control-Request-Headers", "cache-control,content-type");
    headers_12.put("Access-Control-Request-Method", "POST");
    headers_12.put("Origin", "http://192.168.3.136:3001/");
    headers_12.put("Sec-Fetch-Dest", "empty");
    headers_12.put("Sec-Fetch-Mode", "cors");
    headers_12.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_13 = new HashMap<>();
    headers_13.put("Accept", "application/json, text/plain, */*");
    headers_13.put("Cache-Control", "no-cache");
    headers_13.put("Content-Language", "en");
    headers_13.put("Content-Type", "application/json");
    headers_13.put("Origin", "http://192.168.3.136:3001/");
    headers_13.put("Sec-Fetch-Dest", "empty");
    headers_13.put("Sec-Fetch-Mode", "cors");
    headers_13.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_22 = new HashMap<>();
    headers_22.put("Accept", "application/json, text/plain, */*");
    headers_22.put("Cache-Control", "no-cache");
    headers_22.put("Content-Language", "en");
    headers_22.put("If-None-Match", "W/\"b3f-DLzf9CSflHw44+47mEJtmltJaTM\"");
    headers_22.put("Origin", "http://192.168.3.136:3001/");
    headers_22.put("Sec-Fetch-Dest", "empty");
    headers_22.put("Sec-Fetch-Mode", "cors");
    headers_22.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_23 = new HashMap<>();
    headers_23.put("Accept", "application/json, text/plain, */*");
    headers_23.put("Cache-Control", "no-cache");
    headers_23.put("Content-Language", "en");
    headers_23.put("If-None-Match", "W/\"d-FDntQikOdGP0YfJDtZYgrYBvk5Q\"");
    headers_23.put("Origin", "http://192.168.3.136:3001/");
    headers_23.put("Sec-Fetch-Dest", "empty");
    headers_23.put("Sec-Fetch-Mode", "cors");
    headers_23.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_24 = new HashMap<>();
    headers_24.put("Accept", "application/json, text/plain, */*");
    headers_24.put("Cache-Control", "private, max-age=600000");
    headers_24.put("Content-Language", "en");
    headers_24.put("Origin", "http://192.168.3.136:3001/");
    headers_24.put("Sec-Fetch-Dest", "empty");
    headers_24.put("Sec-Fetch-Mode", "cors");
    headers_24.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_25 = new HashMap<>();
    headers_25.put("Accept", "application/json, text/plain, */*");
    headers_25.put("Cache-Control", "no-cache");
    headers_25.put("Content-Language", "en");
    headers_25.put("If-None-Match", "W/\"d6-JgZYm8iqbzWYcD+l+qtnY2S7vWo\"");
    headers_25.put("Origin", "http://192.168.3.136:3001/");
    headers_25.put("Sec-Fetch-Dest", "empty");
    headers_25.put("Sec-Fetch-Mode", "cors");
    headers_25.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_26 = new HashMap<>();
    headers_26.put("Accept", "application/json, text/plain, */*");
    headers_26.put("Cache-Control", "no-cache");
    headers_26.put("Content-Language", "en");
    headers_26.put("If-None-Match", "W/\"23c6-4ICB/c/d5O6K1I6ttzudOyo4OvY\"");
    headers_26.put("Origin", "http://192.168.3.136:3001/");
    headers_26.put("Sec-Fetch-Dest", "empty");
    headers_26.put("Sec-Fetch-Mode", "cors");
    headers_26.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_27 = new HashMap<>();
    headers_27.put("Accept", "application/json, text/plain, */*");
    headers_27.put("Cache-Control", "no-cache");
    headers_27.put("Content-Language", "en");
    headers_27.put("If-None-Match", "W/\"7e-bRv0nsyqIvm0B6TYf2sLf/H8yjI\"");
    headers_27.put("Origin", "http://192.168.3.136:3001/");
    headers_27.put("Sec-Fetch-Dest", "empty");
    headers_27.put("Sec-Fetch-Mode", "cors");
    headers_27.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_28 = new HashMap<>();
    headers_28.put("Accept", "image/avif,image/webp,*/*");
    headers_28.put("Sec-Fetch-Dest", "image");
    headers_28.put("Sec-Fetch-Mode", "no-cors");
    headers_28.put("Sec-Fetch-Site", "cross-site");
    
    Map<CharSequence, String> headers_30 = new HashMap<>();
    headers_30.put("Accept", "application/json, text/plain, */*");
    headers_30.put("Cache-Control", "no-cache");
    headers_30.put("Content-Language", "en");
    headers_30.put("If-None-Match", "W/\"e5-IXlqIFAdrw4km5A0PajCjNfnIjY\"");
    headers_30.put("Origin", "http://192.168.3.136:3001/");
    headers_30.put("Sec-Fetch-Dest", "empty");
    headers_30.put("Sec-Fetch-Mode", "cors");
    headers_30.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_32 = new HashMap<>();
    headers_32.put("Accept", "application/json, text/plain, */*");
    headers_32.put("Cache-Control", "no-cache");
    headers_32.put("Content-Language", "en");
    headers_32.put("If-None-Match", "W/\"6f-eiM1kDoKkWNGHOgkrc7RxQQIExM\"");
    headers_32.put("Origin", "http://192.168.3.136:3001/");
    headers_32.put("Sec-Fetch-Dest", "empty");
    headers_32.put("Sec-Fetch-Mode", "cors");
    headers_32.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_36 = new HashMap<>();
    headers_36.put("Accept", "application/json, text/plain, */*");
    headers_36.put("Cache-Control", "no-cache");
    headers_36.put("Content-Language", "en");
    headers_36.put("If-None-Match", "W/\"1e4-Kz3uqglLlYmslKI28EICuo/RLUY\"");
    headers_36.put("Origin", "http://192.168.3.136:3001/");
    headers_36.put("Sec-Fetch-Dest", "empty");
    headers_36.put("Sec-Fetch-Mode", "cors");
    headers_36.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_37 = new HashMap<>();
    headers_37.put("Accept", "application/json, text/plain, */*");
    headers_37.put("Cache-Control", "no-cache");
    headers_37.put("Content-Language", "en");
    headers_37.put("If-None-Match", "W/\"93-Q+mpN+dH7KlMC8MSFoTJFnOTO80\"");
    headers_37.put("Origin", "http://192.168.3.136:3001/");
    headers_37.put("Sec-Fetch-Dest", "empty");
    headers_37.put("Sec-Fetch-Mode", "cors");
    headers_37.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_38 = new HashMap<>();
    headers_38.put("Accept", "application/json, text/plain, */*");
    headers_38.put("Cache-Control", "no-cache");
    headers_38.put("Content-Language", "en");
    headers_38.put("If-None-Match", "W/\"fa4-zJhb6gixokFDjDAoWYA2po3/gPc\"");
    headers_38.put("Origin", "http://192.168.3.136:3001/");
    headers_38.put("Sec-Fetch-Dest", "empty");
    headers_38.put("Sec-Fetch-Mode", "cors");
    headers_38.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_41 = new HashMap<>();
    headers_41.put("Accept", "application/json, text/plain, */*");
    headers_41.put("Cache-Control", "no-cache");
    headers_41.put("Content-Language", "en");
    headers_41.put("If-None-Match", "W/\"1de-A3ubV152V0Lb0iLLqXsdXwYRo5M\"");
    headers_41.put("Origin", "http://192.168.3.136:3001/");
    headers_41.put("Sec-Fetch-Dest", "empty");
    headers_41.put("Sec-Fetch-Mode", "cors");
    headers_41.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_42 = new HashMap<>();
    headers_42.put("Accept", "application/json, text/plain, */*");
    headers_42.put("Cache-Control", "no-cache");
    headers_42.put("Content-Language", "en");
    headers_42.put("If-None-Match", "W/\"2-l9Fw4VUO7kr8CvBlt4zaMCqXZ0w\"");
    headers_42.put("Origin", "http://192.168.3.136:3001/");
    headers_42.put("Sec-Fetch-Dest", "empty");
    headers_42.put("Sec-Fetch-Mode", "cors");
    headers_42.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_44 = new HashMap<>();
    headers_44.put("Accept", "application/json, text/plain, */*");
    headers_44.put("Cache-Control", "no-cache");
    headers_44.put("Content-Language", "en");
    headers_44.put("If-None-Match", "W/\"1523-YUHp6vbHuS78I+4BUZCKLpGxwMs\"");
    headers_44.put("Origin", "http://192.168.3.136:3001/");
    headers_44.put("Sec-Fetch-Dest", "empty");
    headers_44.put("Sec-Fetch-Mode", "cors");
    headers_44.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_45 = new HashMap<>();
    headers_45.put("Accept", "application/json");
    headers_45.put("Sec-Fetch-Dest", "empty");
    headers_45.put("Sec-Fetch-Mode", "cors");
    headers_45.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_46 = new HashMap<>();
    headers_46.put("Origin", "https://github.com");
    headers_46.put("Scoped-CSRF-Token", "UM6HV-uJ5vVatbwZ7kmN5sqBrL4c_sWvOxq6DYOB-jJwmJpdg9P1pm3Vqrl55kQ7GMorvBSgpLMXwRvVjHo-EA");
    headers_46.put("Sec-Fetch-Dest", "empty");
    headers_46.put("Sec-Fetch-Mode", "same-origin");
    headers_46.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_47 = new HashMap<>();
    headers_47.put("Content-Type", "application/octet-stream");
    headers_47.put("Sec-Fetch-Dest", "empty");
    headers_47.put("Sec-Fetch-Mode", "no-cors");
    headers_47.put("Sec-Fetch-Site", "none");
    
    Map<CharSequence, String> headers_54 = new HashMap<>();
    headers_54.put("Access-Control-Request-Headers", "authorization,content-type,x-goog-authuser");
    headers_54.put("Access-Control-Request-Method", "POST");
    headers_54.put("Origin", "https://mail.google.com");
    headers_54.put("Sec-Fetch-Dest", "empty");
    headers_54.put("Sec-Fetch-Mode", "cors");
    headers_54.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_55 = new HashMap<>();
    headers_55.put("Content-type", "application/json+protobuf");
    headers_55.put("Origin", "https://mail.google.com");
    headers_55.put("Sec-Fetch-Dest", "empty");
    headers_55.put("Sec-Fetch-Mode", "cors");
    headers_55.put("Sec-Fetch-Site", "same-site");
    headers_55.put("X-Goog-AuthUser", "4");
    headers_55.put("authorization", "SAPISIDHASH 1679560004_ccd666a97958bf948a71932fe142cca14e4bd84b");
    
    Map<CharSequence, String> headers_56 = new HashMap<>();
    headers_56.put("Access-Control-Request-Headers", "authorization,x-goog-authuser,x-webchannel-content-type");
    headers_56.put("Access-Control-Request-Method", "POST");
    headers_56.put("Origin", "https://mail.google.com");
    headers_56.put("Sec-Fetch-Dest", "empty");
    headers_56.put("Sec-Fetch-Mode", "cors");
    headers_56.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_57 = new HashMap<>();
    headers_57.put("Origin", "https://mail.google.com");
    headers_57.put("Sec-Fetch-Dest", "empty");
    headers_57.put("Sec-Fetch-Mode", "cors");
    headers_57.put("Sec-Fetch-Site", "same-site");
    headers_57.put("X-Goog-AuthUser", "4");
    headers_57.put("X-WebChannel-Content-Type", "application/json+protobuf");
    headers_57.put("authorization", "SAPISIDHASH 1679560005_0ae353a5d40a4b0d5e0b06df47a1c63e38d8ca3b");
    
    Map<CharSequence, String> headers_58 = new HashMap<>();
    headers_58.put("Access-Control-Request-Headers", "authorization,x-goog-authuser");
    headers_58.put("Access-Control-Request-Method", "GET");
    headers_58.put("Origin", "https://mail.google.com");
    headers_58.put("Sec-Fetch-Dest", "empty");
    headers_58.put("Sec-Fetch-Mode", "cors");
    headers_58.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_64 = new HashMap<>();
    headers_64.put("Access-Control-Request-Headers", "cache-control");
    headers_64.put("Access-Control-Request-Method", "DELETE");
    headers_64.put("Origin", "http://192.168.3.136:3001/");
    headers_64.put("Sec-Fetch-Dest", "empty");
    headers_64.put("Sec-Fetch-Mode", "cors");
    headers_64.put("Sec-Fetch-Site", "same-site");
    
    Map<CharSequence, String> headers_65 = new HashMap<>();
    headers_65.put("Accept", "application/json, text/plain, */*");
    headers_65.put("Cache-Control", "no-cache");
    headers_65.put("Content-Language", "en");
    headers_65.put("Origin", "http://192.168.3.136:3001/");
    headers_65.put("Sec-Fetch-Dest", "empty");
    headers_65.put("Sec-Fetch-Mode", "cors");
    headers_65.put("Sec-Fetch-Site", "same-site");
                    
    String uri6 = "http://192.168.3.136:3001/";
    
    ScenarioBuilder scn = scenario("LoadTestMicroservice")
	.feed(csvFeeder)
		      .exec(
			    http("request_1_0")
			    .options("/api/user/login")
			    .headers(headers_12)
			    .resources(
				       http("request_1_1")
				       .post("/api/user/login")
				       .headers(headers_13)
				       .body(StringBody(
							"{\n" +
							"  \"email\": \"" + "${email}" + "\",\n" +
							"  \"password\": \"" + "${password}" + "\"\n" +
							"}"
							))
				       .asJson()
				       .check(jsonPath("$.email").saveAs("EMAIL")
					      //.check(header("set-cookie").saveAs("ACCESS_TOKEN") //OK
					      )
				       )
			    )
		      .exec(getCookieValue(CookieKey("access_token").saveAs("access_token")))
		      .exec(getCookieValue(CookieKey("refresh_token").saveAs("refresh_token")))
		    .exec( session -> {
		    //System.out.println("ACCESS_TOKEN: "+session.get("access_token").toString());
		    return session;
		   }
		 )	    
	    .doIfOrElse(session -> { return session.get("access_token") != null; } ).then(  
		      pause(5)
		      .exec(
			    http("request_2_0")
			    .options("/api/auth/verify")
			    .headers(headers_5)
			    .resources(
				       http("request_2_1")
				       .get("/api/auth/verify")
				       .headers(headers_7)
				       )
			    )
		      .pause(5)
		      .exec(
			    http("request_3_0")
			    .options("/api/exercise-production")
			    .headers(headers_12)
			    .resources(
				       http("request_3_1")
				       .post("/api/exercise-production")
				       .headers(headers_13)
				       .body(RawFileBody("appmshttp1/0049_request.json"))
				       )
			    )      
		      .pause(5)
		      .exec(
			    http("request_4_0")
			    .options("/api/user/logout")
			    .headers(headers_64)
			    .resources(
				       http("request_4_1")
				       .delete("/api/user/logout")
				       .headers(headers_65)
				       )
			    )	
		      .exec(flushSessionCookies())
		      .pause(5)	
		      .exec(	     
			    http("request_5_0")
			    .options("/api/auth/verify")
			    .headers(headers_5)
			    .resources(
				       http("request_5_1")
				       .get("/api/auth/verify")
				       .headers(headers_32)
				       //.check(status().is(401))
				       )
				     
				     )
	.pause(5)
		      )
	    .orElse(
		    exec( session -> {
			    System.out.println("LOGIN UNSUCCESSFUL = other reqs skipped for this VU");
			    return session;
			}
			)
		    )
	;
    
    //int max_vus = 10;
    //int phase_duration = 20;
    int max_vus = 200;
    //int max_vus = 100;
    int phase_duration = 60;
    setUp(
	  scn.injectOpen(
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(30),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(30),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(30),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(30),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(30),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(30),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(30),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),
			 nothingFor(30),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized(),						    			 
			 nothingFor(30),
			 rampUsersPerSec(1).to(max_vus).during(phase_duration).randomized(),
			 constantUsersPerSec(max_vus).during(phase_duration).randomized())
	  .constantPauses())
	.protocols(httpProtocol);
    
    //setUp(scn.injectOpen(atOnceUsers(5))).protocols(httpProtocol);

  }
}
