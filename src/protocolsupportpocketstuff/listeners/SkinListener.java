package protocolsupportpocketstuff.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import protocolsupportpocketstuff.ProtocolSupportPocketStuff;
import protocolsupportpocketstuff.api.PocketConnection;
import protocolsupportpocketstuff.api.PocketUtils;
import protocolsupportpocketstuff.api.modals.SimpleForm;

public class SkinListener implements Listener {
	
	//Whatever. Will be used later probably.
	@SuppressWarnings("unused")
	private ProtocolSupportPocketStuff plugin;
	
	public SkinListener(ProtocolSupportPocketStuff plugin) {
		this.plugin = plugin;
	}
	
	//TODO: MAKE EVERYTHING :P
	
	
	//Test to send packet.
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		if(e.getMessage().contains(".meep")) {
			Player p = e.getPlayer();
			p.sendMessage("Meep!");
			if(PocketUtils.isPocketPlayer(p)) {
				PocketConnection pcc = PocketConnection.get(p);
				pcc.sendModal(new SimpleForm().setTitle("Meep"));
			}
		}
	}
	
}