#include <Windows.h>
#include <stdlib.h>
#include <iostream>
#include <GL/glut.h>

using namespace std;

const int width = 600;
const int height = 600;
const int NOCOLOR = 0;
const int BLACKSTAR = 1;
const int COLOREDSTAR = 2;
GLfloat mouseX, mouseY;
int paintColor = NOCOLOR;
bool first = true;

void paintStar()
{
	glBegin(GL_POLYGON);
		glVertex2f(-0.5f, 0.1f);
		glVertex2f(-0.1f, 0.1f);
		glVertex2f(-0.3f, 0.4f);
	glEnd();

	glBegin(GL_POLYGON);
		glVertex2f(-0.5f, 0.3f);
		glVertex2f(-0.1f, 0.3f);
		glVertex2f(-0.3f, 0.0f);
	glEnd();
}

void display(void)
{
	if (first) {
		glClear(GL_COLOR_BUFFER_BIT);
		first = false;
	}

	if (paintColor == BLACKSTAR) {
		glColor3f(0.0, 0.0, 0.0);
		paintStar();
	}
	else if (paintColor == COLOREDSTAR) {
		glColor3f((float)rand() / RAND_MAX, (float)rand() / RAND_MAX, (float)rand() / RAND_MAX);
		paintStar();
	}

	glFlush();
}

void mouse(int button, int state, int x, int y)
{
	if (state == GLUT_DOWN) {
		if (button == GLUT_LEFT_BUTTON) {
			paintColor = BLACKSTAR;
		}
		else {
			paintColor = COLOREDSTAR;
			glTranslatef(0.5f, 0.0f, 0.0f);
			glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
		}
	}
	else {
		paintColor = NOCOLOR;
	}

	glutPostRedisplay();
}

void init()
{
	glMatrixMode(GL_MODELVIEW);
	glLoadIdentity();
	glClearColor(1.0, 1.0, 1.0, 1.0);

	glClear(GL_COLOR_BUFFER_BIT);
}

int main(int argc, char** argv)
{
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
	glutInitWindowSize(width, height);
	glutCreateWindow("A - 1908107010062 - Muhammad Saifullah Sani");
	glutMouseFunc(mouse);
	glutDisplayFunc(display);

	init();
	glutMainLoop();
	return 0;
}