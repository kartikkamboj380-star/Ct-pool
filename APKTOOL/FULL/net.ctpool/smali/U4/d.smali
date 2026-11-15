.class public abstract LU4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LU4/d;


# instance fields
.field private final a:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LU4/d$a;

    .line 2
    .line 3
    const-class v1, Ljava/util/Date;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LU4/d$a;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LU4/d;->b:LU4/d;

    .line 9
    .line 10
    return-void
.end method

.method protected constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU4/d;->a:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method
