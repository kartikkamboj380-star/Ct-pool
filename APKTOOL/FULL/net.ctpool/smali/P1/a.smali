.class public final LP1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP1/a;

.field private static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LP1/a;

    .line 2
    .line 3
    invoke-direct {v0}, LP1/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LP1/a;->a:LP1/a;

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

.method public static final a()Z
    .locals 1

    .line 1
    sget-boolean v0, LP1/a;->b:Z

    .line 2
    .line 3
    return v0
.end method
