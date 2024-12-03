//package com.mphasis.filters;
//
//import java.io.ObjectInputFilter.Config;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.cloud.gateway.filter.GatewayFilter;
//import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import reactor.core.publisher.Mono;
//
//public class LoggingGatewayFilterFactory extends AbstractGatewayFilterFactory<LoggingGatewayFilterFactory.Config> {
//
//	private final Logger logger = LoggerFactory.getLogger(LoggingGatewayFilterFactory.class);
//	
//	public LoggingGatewayFilterFactory() {
//		super(Config.class);
//	}
//
//
//	@Override
//	public GatewayFilter apply(Config config) {
//		// TODO Auto-generated method stub
//		return  (exchange, chain) -> {
//			
//			//pre-processing
//			if(config.isPreLogger()) {
//				logger.info("Pre GatewayFilter Logging:" + config.getBaseMessage());
//				
//			}
//			
//			return chain.filter(exchange).then(Mono.fromRunnable (() -> {
//				
//				//post-processing
//				if(config.isPostLogger()) {
//					logger.info("Post  GatewayFilter Logging:" + config.getBaseMessage());	
//				}
//			}));
//					
//		};
//	}
//
//	@Data
//	@NoArgsConstructor
//	@AllArgsConstructor
//	static class Config{
//		
//		//specify you configurations
//		private String baseMessage;
//		private boolean proLogger;
//		private boolean postLogger;
//		public boolean isPreLogger() {
//			// TODO Auto-generated method stub
//			return true;
//		}
//		public boolean isPostLogger() {
//			// TODO Auto-generated method stub
//			return true;
//		}
//		public String getBaseMessage() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//	}
//
//}
