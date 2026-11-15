.class public LS1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS1/g$a;
    }
.end annotation


# static fields
.field private static final j:J

.field private static final k:F


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private final d:LS1/g$a;

.field private e:Landroid/hardware/SensorManager;

.field private f:J

.field private g:I

.field private h:J

.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-wide/16 v1, 0x14

    .line 4
    .line 5
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    sput-wide v1, LS1/g;->j:J

    .line 12
    .line 13
    const-wide/16 v1, 0x3

    .line 14
    .line 15
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    long-to-float v0, v0

    .line 22
    sput v0, LS1/g;->k:F

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(LS1/g$a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LS1/g;->d:LS1/g$a;

    .line 5
    .line 6
    iput p2, p0, LS1/g;->i:I

    .line 7
    .line 8
    return-void
.end method

.method private a(F)Z
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const v0, 0x4150af7e

    .line 6
    .line 7
    .line 8
    cmpl-float p1, p1, v0

    .line 9
    .line 10
    if-lez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    return p1
.end method

.method private b(J)V
    .locals 2

    .line 1
    iget v0, p0, LS1/g;->g:I

    .line 2
    .line 3
    iget v1, p0, LS1/g;->i:I

    .line 4
    .line 5
    mul-int/lit8 v1, v1, 0x8

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, LS1/g;->d()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LS1/g;->d:LS1/g$a;

    .line 13
    .line 14
    invoke-interface {v0}, LS1/g$a;->a()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-wide v0, p0, LS1/g;->h:J

    .line 18
    .line 19
    sub-long/2addr p1, v0

    .line 20
    long-to-float p1, p1

    .line 21
    sget p2, LS1/g;->k:F

    .line 22
    .line 23
    cmpl-float p1, p1, p2

    .line 24
    .line 25
    if-lez p1, :cond_1

    .line 26
    .line 27
    invoke-direct {p0}, LS1/g;->d()V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method private c(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LS1/g;->h:J

    .line 2
    .line 3
    iget p1, p0, LS1/g;->g:I

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, LS1/g;->g:I

    .line 8
    .line 9
    return-void
.end method

.method private d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LS1/g;->g:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, LS1/g;->a:F

    .line 6
    .line 7
    iput v0, p0, LS1/g;->b:F

    .line 8
    .line 9
    iput v0, p0, LS1/g;->c:F

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public e(Landroid/hardware/SensorManager;)V
    .locals 3

    .line 1
    invoke-static {p1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, LS1/g;->e:Landroid/hardware/SensorManager;

    .line 12
    .line 13
    const-wide/16 v1, -0x1

    .line 14
    .line 15
    iput-wide v1, p0, LS1/g;->f:J

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-virtual {p1, p0, v0, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 19
    .line 20
    .line 21
    const-wide/16 v0, 0x0

    .line 22
    .line 23
    iput-wide v0, p0, LS1/g;->h:J

    .line 24
    .line 25
    invoke-direct {p0}, LS1/g;->d()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, LS1/g;->e:Landroid/hardware/SensorManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, LS1/g;->e:Landroid/hardware/SensorManager;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 6

    .line 1
    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    .line 2
    .line 3
    iget-wide v2, p0, LS1/g;->f:J

    .line 4
    .line 5
    sub-long v2, v0, v2

    .line 6
    .line 7
    sget-wide v4, LS1/g;->j:J

    .line 8
    .line 9
    cmp-long v2, v2, v4

    .line 10
    .line 11
    if-gez v2, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v2, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    aget v3, v2, v3

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    aget v4, v2, v4

    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    aget v2, v2, v5

    .line 24
    .line 25
    const v5, 0x411ce80a

    .line 26
    .line 27
    .line 28
    sub-float/2addr v2, v5

    .line 29
    iput-wide v0, p0, LS1/g;->f:J

    .line 30
    .line 31
    invoke-direct {p0, v3}, LS1/g;->a(F)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v1, 0x0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget v0, p0, LS1/g;->a:F

    .line 39
    .line 40
    mul-float/2addr v0, v3

    .line 41
    cmpg-float v0, v0, v1

    .line 42
    .line 43
    if-gtz v0, :cond_1

    .line 44
    .line 45
    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    .line 46
    .line 47
    invoke-direct {p0, v0, v1}, LS1/g;->c(J)V

    .line 48
    .line 49
    .line 50
    iput v3, p0, LS1/g;->a:F

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-direct {p0, v4}, LS1/g;->a(F)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget v0, p0, LS1/g;->b:F

    .line 60
    .line 61
    mul-float/2addr v0, v4

    .line 62
    cmpg-float v0, v0, v1

    .line 63
    .line 64
    if-gtz v0, :cond_2

    .line 65
    .line 66
    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    .line 67
    .line 68
    invoke-direct {p0, v0, v1}, LS1/g;->c(J)V

    .line 69
    .line 70
    .line 71
    iput v4, p0, LS1/g;->b:F

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    invoke-direct {p0, v2}, LS1/g;->a(F)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    iget v0, p0, LS1/g;->c:F

    .line 81
    .line 82
    mul-float/2addr v0, v2

    .line 83
    cmpg-float v0, v0, v1

    .line 84
    .line 85
    if-gtz v0, :cond_3

    .line 86
    .line 87
    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    .line 88
    .line 89
    invoke-direct {p0, v0, v1}, LS1/g;->c(J)V

    .line 90
    .line 91
    .line 92
    iput v2, p0, LS1/g;->c:F

    .line 93
    .line 94
    :cond_3
    :goto_0
    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    .line 95
    .line 96
    invoke-direct {p0, v0, v1}, LS1/g;->b(J)V

    .line 97
    .line 98
    .line 99
    return-void
.end method
