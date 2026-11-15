.class abstract Lu2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu2/d$b;,
        Lu2/d$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lu2/d$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lu2/d$b;-><init>(Lu2/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lu2/d;->a:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    new-instance v0, Lu2/d$a;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lu2/d$a;-><init>(Lu2/c;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lu2/d;->b:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    return-void
.end method
