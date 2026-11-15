.class public Li1/a;
.super Lg1/c;
.source "SourceFile"


# instance fields
.field private n:J

.field private o:J

.field private p:Li1/b;


# direct methods
.method public constructor <init>(Li1/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lg1/c;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Li1/a;->n:J

    .line 7
    .line 8
    iput-wide v0, p0, Li1/a;->o:J

    .line 9
    .line 10
    iput-object p1, p0, Li1/a;->p:Li1/b;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public e(Ljava/lang/String;Ljava/lang/Object;Landroid/graphics/drawable/Animatable;)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iput-wide p1, p0, Li1/a;->o:J

    .line 6
    .line 7
    iget-object p3, p0, Li1/a;->p:Li1/b;

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    iget-wide v0, p0, Li1/a;->n:J

    .line 12
    .line 13
    sub-long/2addr p1, v0

    .line 14
    invoke-interface {p3, p1, p2}, Li1/b;->a(J)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public p(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iput-wide p1, p0, Li1/a;->n:J

    .line 6
    .line 7
    return-void
.end method
