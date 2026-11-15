.class public final Lo1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lo1/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lo1/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lo1/b;->a:Lo1/b;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Landroid/graphics/Rect;Ljava/lang/String;Landroid/graphics/PointF;Ljava/util/Map;Ljava/lang/Object;ZLandroid/net/Uri;)Lp1/b$a;
    .locals 2

    .line 1
    const-string v0, "componentAttribution"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shortcutAttribution"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lp1/b$a;

    invoke-direct {v0}, Lp1/b$a;-><init>()V

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Landroid/graphics/Rect;->width()I

    move-result v1

    iput v1, v0, Lp1/b$a;->h:I

    invoke-virtual {p4}, Landroid/graphics/Rect;->height()I

    move-result p4

    iput p4, v0, Lp1/b$a;->i:I

    :cond_0
    iput-object p5, v0, Lp1/b$a;->j:Ljava/lang/Object;

    if-eqz p6, :cond_1

    iget p4, p6, Landroid/graphics/PointF;->x:F

    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p4

    iput-object p4, v0, Lp1/b$a;->k:Ljava/lang/Float;

    iget p4, p6, Landroid/graphics/PointF;->y:F

    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p4

    iput-object p4, v0, Lp1/b$a;->l:Ljava/lang/Float;

    :cond_1
    iput-object p8, v0, Lp1/b$a;->f:Ljava/lang/Object;

    iput-boolean p9, v0, Lp1/b$a;->m:Z

    iput-object p10, v0, Lp1/b$a;->g:Landroid/net/Uri;

    iput-object p2, v0, Lp1/b$a;->c:Ljava/util/Map;

    iput-object p7, v0, Lp1/b$a;->d:Ljava/util/Map;

    iput-object p1, v0, Lp1/b$a;->b:Ljava/util/Map;

    iput-object p0, v0, Lp1/b$a;->a:Ljava/util/Map;

    iput-object p3, v0, Lp1/b$a;->e:Ljava/util/Map;

    return-object v0
.end method
