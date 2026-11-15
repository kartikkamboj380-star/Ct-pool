.class public final Landroidx/work/impl/j;
.super LW/b;
.source "SourceFile"


# static fields
.field public static final c:Landroidx/work/impl/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/work/impl/j;

    invoke-direct {v0}, Landroidx/work/impl/j;-><init>()V

    sput-object v0, Landroidx/work/impl/j;->c:Landroidx/work/impl/j;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, LW/b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public a(LZ/g;)V
    .locals 1

    .line 1
    const-string v0, "db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    "

    .line 7
    .line 8
    invoke-interface {p1, v0}, LZ/g;->u(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
