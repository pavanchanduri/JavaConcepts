public class Enum {
    public static void main(String[] args) {
        // Example usage of the StatusCodes enum
        // This code demonstrates how to use the enum to retrieve
        // the HTTP status codes and their messages
        // It prints out the code and message for each status code
        System.out.println(StatusCodes.SUCCESS.getCode() + ": " + StatusCodes.SUCCESS.getMessage());
        System.out.println(StatusCodes.NOT_FOUND.getCode() + ": " + StatusCodes.NOT_FOUND.getMessage());
        System.out.println(StatusCodes.INTERNAL_ERROR.getCode() + ": " + StatusCodes.INTERNAL_ERROR.getMessage());
    }
}

enum StatusCodes{
    SUCCESS(200, "OK"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    StatusCodes(int code, String message) {
        this.code = code;
        this.message = message;
    }
    // Getter methods to access the code and message
    // of each status code
    // These methods allow external access to the enum values
    // and their associated properties
    // This is a simple enum to represent HTTP status codes
    // Each enum constant has an integer code and a descriptive message

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}