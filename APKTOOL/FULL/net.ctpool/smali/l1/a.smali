.class public Ll1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll1/a$a;
    }
.end annotation


# instance fields
.field a:Ll1/a$a;

.field final b:F

.field c:Z

.field d:Z

.field e:J

.field f:F

.field g:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    int-to-float p1, p1

    .line 13
    iput p1, p0, Ll1/a;->b:F

    .line 14
    .line 15
    invoke-virtual {p0}, Ll1/a;->a()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static c(Landroid/content/Context;)Ll1/a;
    .locals 1

    .line 1
    new-instance v0, Ll1/a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ll1/a;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ll1/a;->a:Ll1/a$a;

    .line 3
    .line 4
    invoke-virtual {p0}, Ll1/a;->e()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll1/a;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public d(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eq v0, v1, :cond_3

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    if-eq v0, v3, :cond_2

    .line 13
    .line 14
    const/4 p1, 0x3

    .line 15
    if-eq v0, p1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    iput-boolean v2, p0, Ll1/a;->c:Z

    .line 20
    .line 21
    :cond_1
    :goto_0
    iput-boolean v2, p0, Ll1/a;->d:Z

    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget v3, p0, Ll1/a;->f:F

    .line 30
    .line 31
    sub-float/2addr v0, v3

    .line 32
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget v3, p0, Ll1/a;->b:F

    .line 37
    .line 38
    cmpl-float v0, v0, v3

    .line 39
    .line 40
    if-gtz v0, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iget v0, p0, Ll1/a;->g:F

    .line 47
    .line 48
    sub-float/2addr p1, v0

    .line 49
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    iget v0, p0, Ll1/a;->b:F

    .line 54
    .line 55
    cmpl-float p1, p1, v0

    .line 56
    .line 57
    if-lez p1, :cond_7

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    iput-boolean v2, p0, Ll1/a;->c:Z

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget v3, p0, Ll1/a;->f:F

    .line 67
    .line 68
    sub-float/2addr v0, v3

    .line 69
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget v3, p0, Ll1/a;->b:F

    .line 74
    .line 75
    cmpl-float v0, v0, v3

    .line 76
    .line 77
    if-gtz v0, :cond_4

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget v3, p0, Ll1/a;->g:F

    .line 84
    .line 85
    sub-float/2addr v0, v3

    .line 86
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget v3, p0, Ll1/a;->b:F

    .line 91
    .line 92
    cmpl-float v0, v0, v3

    .line 93
    .line 94
    if-lez v0, :cond_5

    .line 95
    .line 96
    :cond_4
    iput-boolean v2, p0, Ll1/a;->d:Z

    .line 97
    .line 98
    :cond_5
    iget-boolean v0, p0, Ll1/a;->d:Z

    .line 99
    .line 100
    if-eqz v0, :cond_1

    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    iget-wide v5, p0, Ll1/a;->e:J

    .line 107
    .line 108
    sub-long/2addr v3, v5

    .line 109
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    int-to-long v5, p1

    .line 114
    cmp-long p1, v3, v5

    .line 115
    .line 116
    if-gtz p1, :cond_1

    .line 117
    .line 118
    iget-object p1, p0, Ll1/a;->a:Ll1/a$a;

    .line 119
    .line 120
    if-eqz p1, :cond_1

    .line 121
    .line 122
    invoke-interface {p1}, Ll1/a$a;->e()Z

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_6
    iput-boolean v1, p0, Ll1/a;->c:Z

    .line 127
    .line 128
    iput-boolean v1, p0, Ll1/a;->d:Z

    .line 129
    .line 130
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 131
    .line 132
    .line 133
    move-result-wide v2

    .line 134
    iput-wide v2, p0, Ll1/a;->e:J

    .line 135
    .line 136
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    iput v0, p0, Ll1/a;->f:F

    .line 141
    .line 142
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    iput p1, p0, Ll1/a;->g:F

    .line 147
    .line 148
    :cond_7
    :goto_1
    return v1
.end method

.method public e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ll1/a;->c:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Ll1/a;->d:Z

    .line 5
    .line 6
    return-void
.end method

.method public f(Ll1/a$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll1/a;->a:Ll1/a$a;

    .line 2
    .line 3
    return-void
.end method
