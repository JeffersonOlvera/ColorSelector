import controller.ColorPickerController;
import view.ColorPicker;

public class Main {
    public static void main(String[] args) {
        ColorPicker colorPicker = new ColorPicker();
        ColorPickerController controller = new ColorPickerController(colorPicker);
        controller.run();
    }
}