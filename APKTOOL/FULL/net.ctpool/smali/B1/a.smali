.class public final LB1/a;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field private final m:LD1/g;


# direct methods
.method public constructor <init>(Ljava/lang/String;LD1/g;)V
    .locals 1

    .line 1
    const-string v0, "encodedImage"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, LB1/a;->m:LD1/g;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()LD1/g;
    .locals 1

    .line 1
    iget-object v0, p0, LB1/a;->m:LD1/g;

    .line 2
    .line 3
    return-object v0
.end method
