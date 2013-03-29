package glassLine.interfaces;

import java.util.List;



public interface ConveyorFamily {

	/**@params: ConveyorFamily family : recipient of glass
	 * boolean ready : whether or not the conveyer family is ready to receive another glass
	*/
	void msgReadyForGlass(ConveyorFamily conveyorFamily,
			boolean ready);
	
	/**@params: ConveyorFamily family : sender of glass, 
	 * Robot robot : in case a robot is sending request
	*/
	
	void msgGlassTransferRequest(ConveyorFamily family); 
	void msgGlassTransferRequest(Robot robot); 
	
	/** @params: String name : name of Glass, List processes : processes performed on glass  
	 * */
	
	void msgHereIsGlass(String name, List<String> processes);



}
