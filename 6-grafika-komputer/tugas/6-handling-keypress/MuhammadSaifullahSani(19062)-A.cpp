#include <GL/freeglut.h>
#include <GL/gl.h>
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

void handleKeypress(unsigned char key, int x, int y) {
	switch (key) {
	case 66 :
	case 98 :
		glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
		break;
	case 75 :
	case 107 :
		Red = 1.0f;
		Green = 1.0f;
		Blue = 0.0f;
		glutPostRedisplay();
		break;
	case 85 :
	case 117 :
		red = 1.0f;
		green = 0.0f;
		blue = 1.0f;
		glutPostRedisplay();
		break;
	case 82 :
	case 114 :
		glRotatef(-45.0f, 0.0f, 0.0f, 1.0f);
		glutPostRedisplay();
		break;
	case 70 :
	case 102 :
		glutFullScreen();
		fullscreen = true;
		break;
	case 27: 
		if (fullscreen) {
			glutLeaveFullScreen();
			fullscreen = false;
		}
		else {
			exit(0);
		}
	}
}

void initGL() {
	glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
}

void display() {
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

int main(int argc, char** argv) {
	glutInit(&argc, argv);
	glutCreateWindow("Muhammad Saifullah Sani (19062) - A");
	glutInitWindowSize(640, 480);
	glutInitWindowPosition(50, 50);
	glutDisplayFunc(display);
	glutKeyboardFunc(handleKeypress);
	initGL();
	glutMainLoop();
	return 0;
}