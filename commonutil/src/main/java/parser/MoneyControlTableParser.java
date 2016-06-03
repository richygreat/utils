package parser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import bean.Stock;

public class MoneyControlTableParser {
	public static void main(String[] args) {
		try {
			List<Stock> lsStocks = new ArrayList<Stock>();
			Stock stock = null;
			Document doc = Jsoup
					.connect(
							"http://www.moneycontrol.com/stocks/marketstats/indexcomp.php?optex=BSE&opttopic=indexcomp&index=26")
					.get();
			for (Element elem : doc.select(".tbldata14")) {
				for (Element tr : elem.getElementsByTag("tr")) {
					int i = 0;
					stock = new Stock();
					for (Element td : tr.getElementsByTag("td")) {
						switch (i) {
						case 0:
							stock.setCompanyName(td.select("a b").text());
							stock.setLinkToData("http://www.moneycontrol.com" + td.select("a").attr("href"));
							break;
						case 1:
							stock.setIndustry(td.select("a b").text());
							break;
						case 2:
							stock.setLastPrice(Double.valueOf(td.text().replace(",","")));
							break;
						case 3:
							stock.setChangeInPrice(Double.valueOf(td.text().replace(",","")));
							break;
						case 4:
							stock.setChangeInPercent(Double.valueOf(td.text().replace(",","")));
							break;
						case 5:
							stock.setMarketCapital(Double.valueOf(td.text().replace(",","")));
							break;
						default:
							break;
						}
						i++;
					}
					System.out.println(stock);
					lsStocks.add(stock);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
