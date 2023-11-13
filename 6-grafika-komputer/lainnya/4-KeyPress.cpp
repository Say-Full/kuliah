#include <GL/freeglut.h>
#include <GL/glut.h>
#include <iostream>
#include <stdlib.h>

using namespace std;
GLfloat Red = 1.0f;
GLfloat Green = 0.0f;
GLfloat Blue = 0.0f;
GLfloat red = 0.0f;
GLfloat green = 1.0f;
GLfloat blue = 0.0f;
bool fullscreen = false;

void init()
{
	glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
}

void display()
{
	glClear(GL_COLOR_BUFFER_BIT);

	glBegin(GL_QUADS);
        glColor3f(Red, Green, Blue);
        glVertex2f(-0.8f, 0.1f);
        glVertex2f(-0.2f, 0.1f);
        glVertex2f(-0.2f, 0.7f);
        glVertex2f(-0.8f, 0.7f);

        glColor3f(red, green, blue);
        glVertex2f(-0.7f, -0.6f);
        glVertex2f(-0.1f, -0.6f);
        glVertex2f(-0.1f, 0.0f);
        glVertex2f(-0.7f, 0.0f);

        glColor3f(0.2f, 0.2f, 0.2f);
        glVertex2f(-0.9f, -0.7f);
        glColor3f(1.0f, 1.0f, 1.0f);
        glVertex2f(-0.5f, -0.7f);
        glColor3f(0.2f, 0.2f, 0.2f);
        glVertex2f(-0.5f, -0.3f);
        glColor3f(1.0f, 1.0f, 1.0f);
        glVertex2f(-0.9f, -0.3f);
	glEnd();

	glBegin(GL_TRIANGLES);
        glColor3f(0.0f, 0.0f, 1.0f);
        glVertex2f(0.1f, -0.6f);
        glVertex2f(0.7f, -0.6f);
        glVertex2f(0.4f, -0.1f);

        glColor3f(1.0f, 0.0f, 0.0f);
        glVertex2f(0.3f, -0.4f);
        glColor3f(0.0f, 1.0f, 0.0f);
        glVertex2f(0.9f, -0.4f);
        glColor3f(0.0f, 0.0f, 1.0f);
        glVertex2f(0.6f, -0.9f);
	glEnd();

	glBegin(GL_POLYGON);
        glColor3f(1.0f, 1.0f, 0.0f);
        glVertex2f(0.4f, 0.2f);
        glVertex2f(0.6f, 0.2f);
        glVertex2f(0.7f, 0.4f);
        glVertex2f(0.6f, 0.6f);
        glVertex2f(0.4f, 0.6f);
        glVertex2f(0.3f, 0.4f);
	glEnd();

	glFlush();
}

void handleKeypress(unsigned char key, int x, int y)
{
	switch (key) {
        case 'B':
        case 'b':
            glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
            break;
        case 'K':
        case 'k':
            Red = 1.0f;
            Green = 1.0f;
            Blue = 0.0f;
            glutPostRedisplay();
            break;
        case 'u':
        case 'U':
            red = 1.0f;
            green = 0.0f;
            blue = 1.0f;
            glutPostRedisplay();
            break;
        case 'R':
        case 'r':
            glRotatef(-45.0f, 0.0f, 0.0f, 1.0f);
            glutPostRedisplay();
            break;
        case 'F':
        case 'f':
            glutFullScreen();
            fullscreen = true;
            break;
        case 27:		// Tombol esc
            if (fullscreen) {
                glutLeaveFullScreen();
                fullscreen = false;
            }
            else {
                exit(0);
            }
	}
}

int main(int argc, char** argv)
{
	glutInit(&argc, argv);
	glutInitWindowSize(640, 480);
	glutInitWindowPosition(50, 50);
	glutCreateWindow("A - 1908107010062 - Muhammad Saifullah Sani");
	glutDisplayFunc(display);
	glutKeyboardFunc(handleKeypress);
	init();
	glutMainLoop();
	return 0;
}