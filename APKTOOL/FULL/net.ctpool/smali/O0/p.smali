.class public abstract LO0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LO0/o;

.field public static final b:LO0/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LO0/p$b;

    .line 2
    .line 3
    invoke-direct {v0}, LO0/p$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LO0/p;->a:LO0/o;

    .line 7
    .line 8
    new-instance v0, LO0/p$c;

    .line 9
    .line 10
    invoke-direct {v0}, LO0/p$c;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LO0/p;->b:LO0/o;

    .line 14
    .line 15
    return-void
.end method

.method public static a(Ljava/lang/Object;)LO0/o;
    .locals 1

    .line 1
    new-instance v0, LO0/p$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LO0/p$a;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
