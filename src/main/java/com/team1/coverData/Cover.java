package com.team1.coverData;

import org.springframework.ui.Model;

public class Cover {
	
	private static String cover_all 		= "https://images.pexels.com/photos/1546168/pexels-photo-1546168.jpeg?cs=srgb&dl=pexels-david-mcbee-1546168.jpg&fm=jpg";
	private static String header_all 		= "전체보기";
	private static String text_all 			= "오늘 동네에선 어떤 일이 일어났을까요?";
	
	private static String cover_life 		= "https://images.pexels.com/photos/5430816/pexels-photo-5430816.jpeg?cs=srgb&dl=pexels-polina-kovaleva-5430816.jpg&fm=jpg";
	private static String header_life 		= "일상생활";
	private static String text_life 		= "여러분의 일상을 이웃 주민들과 공유해보세요!";
	
	private static String cover_help	 	= "https://images.pexels.com/photos/3823489/pexels-photo-3823489.jpeg?cs=srgb&dl=pexels-andrea-piacquadio-3823489.jpg&fm=jpg";
	private static String header_help 		= "해주세요";
	private static String text_help	 		= "도움이 필요하신가요? 이웃들에게 부탁해보세요!";

	private static String cover_news 		= "https://images.pexels.com/photos/6053/man-hands-reading-boy.jpg?cs=srgb&dl=pexels-kaboompics-com-6053.jpg&fm=jpg";
	private static String header_news 		= "동네소식";
	private static String text_news 		= "이웃들과 최신 소식을 공유해보세요!";
	
	private static String cover_qeustion 	= "https://images.pexels.com/photos/5428836/pexels-photo-5428836.jpeg?cs=srgb&dl=pexels-olya-kobruseva-5428836.jpg&fm=jpg";
	private static String header_qeustion 	= "동네질문";
	private static String text_qeustion 	= "이웃들에게 물어보고 싶은게 있으신가요?";
	

	public static void setCover(String tag, Model model) {
		//나중에 리팩토링 할것
		
		if (tag.equals("all")) {
			
			// 커버 데이터 전송용
			String coverImg = Cover.cover_all;
			String coverHeader = Cover.header_all;
			String coverText = Cover.text_all;

			model.addAttribute("coverImg", coverImg);
			model.addAttribute("coverHeader", coverHeader);
			model.addAttribute("coverText", coverText);
			
		}

		if (tag.equals("news")) {
			
			String coverImg = Cover.cover_news;
			String coverHeader = Cover.header_news;
			String coverText = Cover.text_news;

			model.addAttribute("coverImg", coverImg);
			model.addAttribute("coverHeader", coverHeader);
			model.addAttribute("coverText", coverText);

		}

		if (tag.equals("life")) {
			
			// 커버 데이터 전송용
			String coverImg = Cover.cover_life;
			String coverHeader = Cover.header_life;
			String coverText = Cover.text_life;

			model.addAttribute("coverImg", coverImg);
			model.addAttribute("coverHeader", coverHeader);
			model.addAttribute("coverText", coverText);
		}

		if (tag.equals("question")) {
			
			String coverImg = Cover.cover_qeustion;
			String coverHeader = Cover.header_qeustion;
			String coverText = Cover.text_qeustion;

			model.addAttribute("coverImg", coverImg);
			model.addAttribute("coverHeader", coverHeader);
			model.addAttribute("coverText", coverText);
		}

		if (tag.equals("help")) {
			
			String coverImg = Cover.cover_help;
			String coverHeader = Cover.header_help;
			String coverText = Cover.text_help;

			model.addAttribute("coverImg", coverImg);
			model.addAttribute("coverHeader", coverHeader);
			model.addAttribute("coverText", coverText);

		}
	}
	
	
}
