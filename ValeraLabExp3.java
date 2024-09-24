import java.util.*;

public class ValeraLabExp3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n*************************************");
            System.out.println("\tMEASUREMENT CONVERTER");
            System.out.println("*************************************");

            System.out.println("\nChoose Length From:\n");
            System.out.println("\t 1. Meters");
            System.out.println("\t 2. Millimeters");
            System.out.println("\t 3. Centimeters");
            System.out.println("\t 4. Kilometers");
            System.out.println("\t 5. Inches");
            System.out.println("\t 6. Feet");
            System.out.println("\t 7. Yards");
            System.out.println("\t 8. Miles");
            System.out.println("\t 9. Exit");

            System.out.print("\nInput Length Option: ");
            int lengthFrom = input.nextInt();

            switch (lengthFrom) {
                case 1: {
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.println("\n*************************************");
                        System.out.println("\tMEASUREMENT CONVERTER");
                        System.out.println("*************************************");

                        System.out.println("\nLength From:\t Meters\n");
                        System.out.println("\nChoose Length To:\n");
                        System.out.println("\t 1. Millimeters");
                        System.out.println("\t 2. Centimeters");
                        System.out.println("\t 3. Kilometers");
                        System.out.println("\t 4. Inches");
                        System.out.println("\t 5. Feet");
                        System.out.println("\t 6. Yards");
                        System.out.println("\t 7. Miles");
                        System.out.print("\nInput Length Option: ");
                        int lengthTo = input.nextInt();

                        // Computation
                        switch (lengthTo) {
                            case 1: {
                                System.out.print("\nEnter Length: \t");
                                float lengthVal = input.nextFloat();

                                if (lengthVal >= 0) {
                                    float lengthConverted = lengthVal * 1000;
                                    System.out.printf(
                                            "The Converted Value of %,.2f Meters is Equal to %,.2f Millimeters\n",
                                            lengthVal, lengthConverted);
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid Input!!! Positive Integer Only!!");
                                }
                                break;
                            }
                            case 2: {
                                System.out.print("\nEnter Length: \t");
                                float lengthVal = input.nextFloat();

                                if (lengthVal >= 0) {
                                    float lengthConverted = lengthVal * 100;
                                    System.out.printf(
                                            "The Converted Value of %,.2f Meters is Equal to %,.2f Centimeters\n",
                                            lengthVal, lengthConverted);
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid Input!!! Positive Integer Only!!");
                                }
                                break;
                            }
                            case 3: {
                                System.out.print("\nEnter Length: \t");
                                float lengthVal = input.nextFloat();

                                if (lengthVal >= 0) {
                                    float lengthConverted = (float) (lengthVal * 0.001);
                                    System.out.printf(
                                            "The Converted Value of %,.2f Meters is Equal to %,.2f Kilometers\n",
                                            lengthVal, lengthConverted);
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid Input!!! Positive Integer Only!!");
                                }
                                break;
                            }
                            case 4: {
                                System.out.print("\nEnter Length: \t");
                                float lengthVal = input.nextFloat();

                                if (lengthVal >= 0) {
                                    float lengthConverted = (float) (lengthVal * 39.37);
                                    System.out.printf(
                                            "The Converted Value of %,.2f Meters is Equal to %,.2f Inches\n",
                                            lengthVal, lengthConverted);
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid Input!!! Positive Integer Only!!");
                                }
                                break;
                            }
                            case 5: {
                                System.out.print("\nEnter Length: \t");
                                float lengthVal = input.nextFloat();

                                if (lengthVal >= 0) {
                                    float lengthConverted = (float) (lengthVal * 3.281);
                                    System.out.printf(
                                            "The Converted Value of %,.2f Meters is Equal to %,.3f Feet\n",
                                            lengthVal, lengthConverted);
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid Input!!! Positive Integer Only!!");
                                }
                                break;
                            }
                            case 6: {
                                System.out.print("\nEnter Length: \t");
                                float lengthVal = input.nextFloat();

                                if (lengthVal >= 0) {
                                    float lengthConverted = (float) (lengthVal * 1.0936);
                                    System.out.printf(
                                            "The Converted Value of %,.2f Meters is Equal to %,.3f Yards\n",
                                            lengthVal, lengthConverted);
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid Input!!! Positive Integer Only!!");
                                }
                                break;
                            }
                            case 7: {
                                System.out.print("\nEnter Length: \t");
                                float lengthVal = input.nextFloat();

                                if (lengthVal >= 0) {
                                    float lengthConverted = (float) (lengthVal * 0.0006214);
                                    System.out.printf(
                                            "The Converted Value of %,.2f Meters is Equal to %,.5f Miles\n",
                                            lengthVal, lengthConverted);
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid Input!!! Positive Integer Only!!");
                                }
                                break;
                            }
                            default: {
                                System.out.println("\n\tInput Invalid! Try Again!");
                                break;
                            }
                        }
                    }
                    break;
                }

                case 2: {
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.println("\n*************************************");
                        System.out.println("\tMEASUREMENT CONVERTER");
                        System.out.println("*************************************");

                        System.out.println("\nLength From:\t Millimeters\n");
                        System.out.println("\nChoose Length To:\n");
                        System.out.println("\t 1. Meters");
                        System.out.println("\t 2. Centimeters");
                        System.out.println("\t 3. Kilometers");
                        System.out.println("\t 4. Inches");
                        System.out.println("\t 5. Feet");
                        System.out.println("\t 6. Yards");
                        System.out.println("\t 7. Miles");
                        System.out.print("\nInput Length Option: ");
                        int lengthTo = input.nextInt();

                        // Computation
                        switch (lengthTo) {
                            case 1: {
                                System.out.print("\nEnter Length: \t");
                                float lengthVal = input.nextFloat();

                                if (lengthVal >= 0) {
                                    float lengthConverted = lengthVal * 1000;
                                    System.out.printf(
                                            "The Converted Value of %,.2f Millimeters is Equal to %,.2f Meters\n",
                                            lengthVal, lengthConverted);
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid Input!!! Positive Integer Only!!");
                                }
                                break;
                            }
                            case 2: {
                                System.out.print("\nEnter Length: \t");
                                float lengthVal = input.nextFloat();

                                if (lengthVal >= 0) {
                                    float lengthConverted = lengthVal * 100;
                                    System.out.printf(
                                            "The Converted Value of %,.2f Millimeters is Equal to %,.2f Centimeters\n",
                                            lengthVal, lengthConverted);
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid Input!!! Positive Integer Only!!");
                                }
                                break;
                            }
                            case 3: {
                                System.out.print("\nEnter Length: \t");
                                float lengthVal = input.nextFloat();

                                if (lengthVal >= 0) {
                                    float lengthConverted = (float) (lengthVal * 0.001);
                                    System.out.printf(
                                            "The Converted Value of %,.2f Millimeters is Equal to %,.2f Kilometers\n",
                                            lengthVal, lengthConverted);
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid Input!!! Positive Integer Only!!");
                                }
                                break;
                            }
                            case 4: {
                                System.out.print("\nEnter Length: \t");
                                float lengthVal = input.nextFloat();

                                if (lengthVal >= 0) {
                                    float lengthConverted = (float) (lengthVal * 39.37);
                                    System.out.printf(
                                            "The Converted Value of %,.2f Millimeters is Equal to %,.2f Inches\n",
                                            lengthVal, lengthConverted);
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid Input!!! Positive Integer Only!!");
                                }
                                break;
                            }
                            case 5: {
                                System.out.print("\nEnter Length: \t");
                                float lengthVal = input.nextFloat();

                                if (lengthVal >= 0) {
                                    float lengthConverted = (float) (lengthVal * 3.281);
                                    System.out.printf(
                                            "The Converted Value of %,.2f Millimeters is Equal to %,.3f Feet\n",
                                            lengthVal, lengthConverted);
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid Input!!! Positive Integer Only!!");
                                }
                                break;
                            }
                            case 6: {
                                System.out.print("\nEnter Length: \t");
                                float lengthVal = input.nextFloat();

                                if (lengthVal >= 0) {
                                    float lengthConverted = (float) (lengthVal * 1.0936);
                                    System.out.printf(
                                            "The Converted Value of %,.2f Millimeters is Equal to %,.3f Yards\n",
                                            lengthVal, lengthConverted);
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid Input!!! Positive Integer Only!!");
                                }
                                break;
                            }
                            case 7: {
                                System.out.print("\nEnter Length: \t");
                                float lengthVal = input.nextFloat();

                                if (lengthVal >= 0) {
                                    float lengthConverted = (float) (lengthVal * 0.0006214);
                                    System.out.printf(
                                            "The Converted Value of %,.2f Millimeters is Equal to %,.5f Miles\n",
                                            lengthVal, lengthConverted);
                                    validInput = true;
                                } else {
                                    System.out.println("Invalid Input!!! Positive Integer Only!!");
                                }
                                break;
                            }
                            default: {
                                System.out.println("\n\tInput Invalid! Try Again!");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.println("\n*************************************");
                        System.out.println("\tMEASUREMENT CONVERTER");
                        System.out.println("*************************************");

                        System.out.println("\nLength From:\t Centimeters\n");
                        System.out.println("\nChoose Length To:\n");
                        System.out.println("\t 1. Meters");
                        System.out.println("\t 2. Millimeters");
                        System.out.println("\t 3. Kilometers");
                        System.out.println("\t 4. Inches");
                        System.out.println("\t 5. Feet");
                        System.out.println("\t 6. Yards");
                        System.out.println("\t 7. Miles");
                        System.out.print("\nInput Length Option: ");
                        int lengthTo = input.nextInt();

                    }
                    break;
                }
                case 4: {
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.println("\n*************************************");
                        System.out.println("\tMEASUREMENT CONVERTER");
                        System.out.println("*************************************");

                        System.out.println("\nLength From:\t Kilometers\n");
                        System.out.println("\nChoose Length To:\n");
                        System.out.println("\t 1. Meters");
                        System.out.println("\t 2. Millimeters");
                        System.out.println("\t 3. Centimeters");
                        System.out.println("\t 4. Inches");
                        System.out.println("\t 5. Feet");
                        System.out.println("\t 6. Yards");
                        System.out.println("\t 7. Miles");
                        System.out.print("\nInput Length Option: ");
                        int lengthTo = input.nextInt();

                    }
                    break;
                }
                case 5: {
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.println("\n*************************************");
                        System.out.println("\tMEASUREMENT CONVERTER");
                        System.out.println("*************************************");

                        System.out.println("\nLength From:\t Inches\n");
                        System.out.println("\nChoose Length To:\n");
                        System.out.println("\t 1. Meters");
                        System.out.println("\t 2. Millimeters");
                        System.out.println("\t 3. Centimeters");
                        System.out.println("\t 4. Kilometers");
                        System.out.println("\t 5. Feet");
                        System.out.println("\t 6. Yards");
                        System.out.println("\t 7. Miles");
                        System.out.print("\nInput Length Option: ");
                        int lengthTo = input.nextInt();

                    }
                    break;
                }
                case 6: {
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.println("\n*************************************");
                        System.out.println("\tMEASUREMENT CONVERTER");
                        System.out.println("*************************************");

                        System.out.println("\nLength From:\t Feet\n");
                        System.out.println("\nChoose Length To:\n");
                        System.out.println("\t 1. Meters");
                        System.out.println("\t 2. Millimeters");
                        System.out.println("\t 3. Centimeters");
                        System.out.println("\t 4. Kilometers");
                        System.out.println("\t 5. Inches");
                        System.out.println("\t 6. Yards");
                        System.out.println("\t 7. Miles");
                        System.out.print("\nInput Length Option: ");
                        int lengthTo = input.nextInt();

                    }
                    break;

                }
                case 7: {
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.println("\n*************************************");
                        System.out.println("\tMEASUREMENT CONVERTER");
                        System.out.println("*************************************");

                        System.out.println("\nLength From:\t Yards\n");
                        System.out.println("\nChoose Length To:\n");
                        System.out.println("\t 1. Meters");
                        System.out.println("\t 2. Millimeters");
                        System.out.println("\t 3. Centimeters");
                        System.out.println("\t 4. Kilometers");
                        System.out.println("\t 5. Inches");
                        System.out.println("\t 6. Feet");
                        System.out.println("\t 7. Miles");
                        System.out.print("\nInput Length Option: ");
                        int lengthTo = input.nextInt();

                    }
                    break;
                }
                case 8: {
                    boolean validInput = false;
                    while (!validInput) {
                        System.out.println("\n*************************************");
                        System.out.println("\tMEASUREMENT CONVERTER");
                        System.out.println("*************************************");

                        System.out.println("\nLength From:\t Miles\n");
                        System.out.println("\nChoose Length To:\n");
                        System.out.println("\t 1. Meters");
                        System.out.println("\t 2. Millimeters");
                        System.out.println("\t 3. Centimeters");
                        System.out.println("\t 4. Kilometers");
                        System.out.println("\t 5. Inches");
                        System.out.println("\t 6. Feet");
                        System.out.println("\t 7. Yards");
                        System.out.print("\nInput Length Option: ");
                        int lengthTo = input.nextInt();

                    }
                    break;
                }
                case 9: {
                    System.exit(lengthFrom);
                }
                default: {
                    System.out.println("\n\tInput Invald! Try Again!");
                    break;
                }

            }
        }
    }
}

