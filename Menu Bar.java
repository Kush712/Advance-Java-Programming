import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Practical 9 : Write a program using AWT to create a menu bar where the menu bar contains menu items
 * such as File, Edit, View, and create a submenu under the File menu: New and Open.
 * @author Kush
 * Division : Q-C
 * Batch : Q-C1
 */
public class Ajp_pr9_QC1 extends Frame {
    public static void main(String[] args) {
        
        // Create a new Frame with the title "Notepad -QC1"
        Frame f = new Frame("Notepad -QC1");

        // Create a new MenuBar
        MenuBar mb = new MenuBar();
        // Set the MenuBar for the Frame
        f.setMenuBar(mb);

        // Create Menus
        Menu mf = new Menu("File");     // File menu
        Menu me = new Menu("Edit");     // Edit menu
        Menu mfo = new Menu("Format");  // Format menu
        Menu mv = new Menu("View");     // View menu
        Menu mh = new Menu("Help");     // Help menu

        // Add Menus to the MenuBar
        mb.add(mf);
        mb.add(me);
        mb.add(mfo);
        mb.add(mv);
        mb.add(mh);

        // Create MenuItems for the File menu
        MenuItem MNT = new MenuItem("New Tab");    // New Tab item
        MenuItem mnw = new MenuItem("New Window"); // New Window item
        MenuItem mo = new MenuItem("Open");        // Open item
        MenuItem ms = new MenuItem("Save");        // Save item
        MenuItem msas = new MenuItem("Save As");   // Save As item
        MenuItem msall = new MenuItem("Save All"); // Save All item
        MenuItem mp = new MenuItem("Print");       // Print item
        MenuItem mexit = new MenuItem("Exit");     // Exit item

        // Add MenuItems to the File menu
        mf.add(MNT);
        mf.add(mnw);
        mf.add(mo);
        mf.add(ms);
        mf.add(msas);
        mf.add(msall);
        mf.add(mp);
        mf.add(mexit);

        // Create MenuItems for the Edit menu
        MenuItem cut = new MenuItem("Cut");         // Cut item
        MenuItem copy = new MenuItem("Copy");       // Copy item
        MenuItem paste = new MenuItem("Paste");     // Paste item
        MenuItem delete = new MenuItem("Delete");   // Delete item
        MenuItem selectAll = new MenuItem("Select All"); // Select All item
        MenuItem find = new MenuItem("Find");       // Find item
        MenuItem replace = new MenuItem("Replace"); // Replace item

        // Add MenuItems to the Edit menu
        me.add(cut);
        me.add(copy);
        me.add(paste);
        me.add(delete);
        me.add(selectAll);
        me.add(find);
        me.add(replace);

        // Create MenuItems for the Format menu
        MenuItem font = new MenuItem("Font");         // Font item
        MenuItem align = new MenuItem("Align");       // Align item
        MenuItem color = new MenuItem("Color");       // Color item

        // Add MenuItems to the Format menu
        mfo.add(font);
        mfo.add(align);
        mfo.add(color);

        // Create MenuItems for the View menu
        MenuItem zoomIn = new MenuItem("Zoom In");    // Zoom In item
        MenuItem zoomOut = new MenuItem("Zoom Out");  // Zoom Out item
        MenuItem fullScreen = new MenuItem("Full Screen"); // Full Screen item

        // Add MenuItems to the View menu
        mv.add(zoomIn);
        mv.add(zoomOut);
        mv.add(fullScreen);

        // Create MenuItems for the Help menu
        MenuItem helpContents = new MenuItem("Help Contents");   // Help Contents item
        MenuItem about = new MenuItem("About");                   // About item

        // Add MenuItems to the Help menu
        mh.add(helpContents);
        mh.add(about);

        // Set the size of the Frame
        f.setSize(400, 400);
        // Make the Frame visible
        f.setVisible(true);

        // Add a WindowListener to handle the window closing event
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
