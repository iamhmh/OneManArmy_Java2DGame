package entity;

import main.GamePanel;
import object.OBJ_StaminUp;

public class NPC_StaminUp_Machine extends Entity{
    public NPC_StaminUp_Machine(GamePanel gp){
        super(gp);

        type = type_npc;

        direction = "down";
        //speed = 1;

        getImage();
        setDialogue();
        setItems();
    }

    public void getImage(){
        up1 = setup("/npc/staminup_machine_bottom",gp.tileSize,gp.tileSize);
        up2 = setup("/npc/staminup_machine_bottom",gp.tileSize,gp.tileSize);
        down1 = setup("/npc/staminup_machine_bottom",gp.tileSize,gp.tileSize);
        down2 = setup("/npc/staminup_machine_bottom",gp.tileSize,gp.tileSize);
        left1 = setup("/npc/staminup_machine_bottom",gp.tileSize,gp.tileSize);
        left2 = setup("/npc/staminup_machine_bottom",gp.tileSize,gp.tileSize);
        right1 = setup("/npc/staminup_machine_bottom",gp.tileSize,gp.tileSize);
        right2 = setup("/npc/staminup_machine_bottom",gp.tileSize,gp.tileSize);
    }

    public void setDialogue(){
        dialogues[0] = "Ready to speed up ?";
    }

    public void setItems(){
        inventory.add(new OBJ_StaminUp(gp));
    }

    public void speak(){
        super.speak();
        gp.gameState = gp.tradeState;
        gp.ui.machine = this;
    }
}
