# Coding Assignment – Associate Software Engineer

This repository contains the code for **Assignments**: 

## Assignment 1- Designing a responsive profile card using HTML and CSS. The profile card includes the following elements:

- A profile picture
- Name and designation
- A short bio
- Social media icons

The card is designed to be centered on the page and adapt seamlessly to different screen sizes. CSS animations are applied to create an engaging hover effect.

### Features

- **Responsive Design**: The card adjusts its layout beautifully across various devices and screen sizes.
- **Profile Picture**: A circular profile image for a clean and professional look.
- **Name & Designation**: Clearly highlighted at the top of the card.
- **Short Bio**: An area for a concise introduction or description.
- **Social Media Icons**: Icons linking to your social media profiles.
- **CSS Animations**: A smooth hover effect to enhance user interaction.

### Screenshots

Below is a preview of the profile card:

![Profile Card Screenshot](/Assignment1/assets/profileCard.png)  

---

## Assignment 2 - String Manipulation - Anagram Check

### Description
This program checks if two strings are anagrams. It removes whitespaces, handles case insensitivity, and uses a `HashMap` for efficient character counting to compare the two strings.

### Features
- **Whitespace Handling**: The program ignores spaces in both strings for accurate comparison.
- **Case Insensitivity**: Handles uppercase and lowercase letters as equal.
- **HashMap Utilization**: Efficient character counting to ensure accuracy.
- **Validation**: Returns `true` if the strings are anagrams, otherwise `false`.

![Program Output Screenshot2](/Assignment2/assets/Screenshot1.png)  
![Program Output Screenshot2](/Assignment2/assets/Screenshot2.png)  

---

## Assignment 3 - Object-Oriented Programming - Employee Management System

### Description
This Java program showcases the management of employee records using object-oriented programming principles. It includes enhanced features such as validation for employee fields, error handling, and consistent output formatting using `String.format`.

### Features
- **Validation**:
    - Employee ID must be positive.
    - Name cannot be null or empty.
    - Salary must be positive.
- **Error Handling**:
    - Gracefully manages invalid input with clear error messages.
- **Readable Output**:
    - Uses `String.format()` for clean and consistent display of employee details.
- **Encapsulation**:
    - Protects and manages employee data effectively within the `Employee` class.
- **Dynamic Data Storage**:
    - Uses `ArrayList` for flexible storage and management of employee records.


### Example Output
![Program Output Screenshot2](/Assignment3/assets/Employee.png)

---

## Assignment 4 - To-Do List Application Using HTML, CSS, and JavaScript

### Description
This project is a responsive To-Do List application built using HTML, CSS, and JavaScript. It allows users to manage their tasks interactively with features such as adding, removing tasks, and persisting tasks using the browser's local storage.

### Features
- **Add Tasks**: Users can add new tasks via the input field and a dedicated button or by pressing the `Enter` key.
- **Remove Tasks**: Each task has a "Remove" button to delete it from the list.
- **Local Storage Integration**: Tasks persist between sessions by saving and loading them from the browser's local storage.
- **Responsive Design**: The application is styled to work on different screen sizes.
- **Interactive UI**:
  - Smooth hover effects on buttons.
  - Clean and modern layout with enhanced user experience.

### Example
Below is an example of how the application looks when in use:

![To-Do List Screenshot](/Assignment4/assets/Todo.png)

---

## Assignment 5: Responsive Image Slider

### Project Overview
This project demonstrates the creation of a responsive image slider using **HTML**, **CSS**, and **JavaScript**. It allows users to navigate through a series of images interactively, with functional **Previous** and **Next** buttons.

### Features
- Responsive design: Optimized for various screen sizes.
- Smooth navigation: Easily browse images using buttons.
- Accessibility: Button controls positioned for intuitive interaction.

### Structure
#### 1. **HTML**
   - Defines the layout of the slider.
   - Includes **slider-container**, image elements, and navigation buttons.

#### 2. **CSS**
   - Implements the styling for layout and animations.
   - Positions buttons for seamless interaction.

#### 3. **JavaScript**
   - Adds interactivity to navigate between images.
   - Handles image display logic and circular navigation.

### How to Use
1. Clone the repository to your local system.
2. Place your images in the `assets/` folder.
3. Open the `index.html` file in your browser to view the image slider.

### Code Breakdown
#### JavaScript Functions
- **showImage(index):** Displays the image corresponding to the provided index.
- **prevImage():** Navigates to the previous image in the slider.
- **nextImage():** Navigates to the next image in the slider.


